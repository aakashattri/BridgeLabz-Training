
import java.util.*;
class HotelSystem {
    private Set<Room> avRooms=new HashSet<>();
    private Map<String, Reservation> reservations = new HashMap<>();
    public void addRoom(Room room) {
        avRooms.add(room);
    }
    public Reservation bookRoom(
            String reservationId,
            Guest guest,
            Room room,
            int days,
            PricingStrategy pricingStrategy
    ) throws RoomNotAvailableException {

        if (!avRooms.contains(room)) {
            throw new RoomNotAvailableException("Room not available");
        }
        double amount = pricingStrategy.calculatePrice(room.basePrice, days);
        Reservation reservation =
                new Reservation(reservationId, guest, room, days, amount);
        reservations.put(reservationId, reservation);
        avRooms.remove(room);
        return reservation;
    }
    public void checkout(String reservationId) {
        Reservation reservation = reservations.get(reservationId);
        if (reservation != null) {
            avRooms.add(reservation.getRoom());
            reservations.remove(reservationId);
        }
    }
}


abstract class Room {

    protected int roomNumber;
    protected double basePrice;

    public Room(int roomNumber, double basePrice) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return basePrice;
    }

    public abstract String getRoomType();

}


class StandardRoom extends Room {

    public StandardRoom(int roomNumber) {
        super(roomNumber, 2000);
    }

    @Override
    public String getRoomType() {
        return "Standard Room";
    }
}


class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber) {
        super(roomNumber, 4000);
    }

    @Override
    public String getRoomType() {
        return "Deluxe Room";
    }
}


class Guest {
    private String name;

    public Guest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}



class Reservation {
    private String reservationId;
    private Guest guest;
    private Room room;
    private int days;
    private double totalAmount;

    public Reservation(String reservationId, Guest guest, Room room,
                       int days, double totalAmount) {
        this.reservationId=reservationId;
        this.guest=guest;
        this.room=room;
        this.days=days;
        this.totalAmount=totalAmount;
    }

    public String getReservationId() {
        return reservationId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Room getRoom() {
        return room;
    }
}


class Booking<T extends Room> {
    private T room;

    public Booking(T room) {
        this.room = room;
    }

    public T getRoom() {
        return room;
    }
}


interface PricingStrategy {
    double calculatePrice(double basePrice, int days);
}

class SeasonalPricing implements PricingStrategy {
    private double multiplier;

    public SeasonalPricing(double multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public double calculatePrice(double basePrice, int days) {
        return basePrice * days * multiplier;
    }
}


class RoomNotAvailableException extends Exception {
    public RoomNotAvailableException(String message) {
        super(message);
    }
}

class Invoice {
    public static void generate(Reservation reservation) {
        System.out.println("----- INVOICE -----");
        System.out.println("Reservation ID: " + reservation.getReservationId());
        System.out.println("Room: " + reservation.getRoom().getRoomType());
        System.out.println("Amount: ₹" + reservation.getTotalAmount());
        System.out.println("-------------------");
    }
}



public class HotelReservation{

    public static void main(String[] args) {

        try {
            HotelSystem hotel=new HotelSystem();
            Room r1=new StandardRoom(101);
            Room r2=new DeluxeRoom(201);
            hotel.addRoom(r1);
            hotel.addRoom(r2);

            Guest guest = new Guest("Shivam");

            PricingStrategy seasonalPricing =
                    new SeasonalPricing(1.2);

            Reservation res = hotel.bookRoom(
                    "RES1001",
                    guest,
                    r2,
                    3,
                    seasonalPricing
            );

            Invoice.generate(res);

            hotel.checkout("RES1001");


        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }

}