
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Flight {
    String flightId;
    String source;
    String destination;
    int seatsAvailable;

    Flight(String flightId,String source,String destination,int seatsAvailable) {
        this.flightId=flightId;
        this.source=source;
        this.destination=destination;
        this.seatsAvailable=seatsAvailable;
    }

    @Override
    public String toString() {
        return "Flight ID: "+flightId+
                ", From: "+source+
                ", To: "+destination+
                ", Seats: "+seatsAvailable;
    }
}

public class FlightBookingSystem {
    private static Flight[]flights={
            new Flight("F101","Delhi","Mumbai",5),
            new Flight("F102","Delhi","Bangalore",3),
            new Flight("F103","Mumbai","Chennai",4)
    };

    private static List<Flight> bookings=new ArrayList<>();
    public static void searchFlights(String source,String destination) {
        boolean found=false;
        for (Flight flight:flights) {
            if (flight.source.equalsIgnoreCase(source)
                    && flight.destination.equalsIgnoreCase(destination)) {
                System.out.println(flight);
                found=true;
            }
        }
        if (!found) {
            System.out.println("No flights found.");
        }
    }

    public static void bookFlight(String flightId) {
        for (Flight flight:flights) {
            if (flight.flightId.equalsIgnoreCase(flightId)) {
                if (flight.seatsAvailable>0) {
                    bookings.add(flight);
                    flight.seatsAvailable--;
                    System.out.println("Flight booked successfully!");
                } else {
                    System.out.println("No seats available.");
                }
                return;
            }
        }
        System.out.println("Invalid Flight ID.");
    }

    public static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
            return;
        }
        System.out.println("Your Bookings:");
        for (Flight flight : bookings) {
            System.out.println(flight);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("\n1. Search Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter source: ");
                    String source=sc.nextLine();
                    System.out.print("Enter destination: ");
                    String destination=sc.nextLine();
                    searchFlights(source, destination);
                    break;

                case 2:
                    System.out.print("Enter Flight ID to book: ");
                    String flightId=sc.nextLine();
                    bookFlight(flightId);
                    break;
                case 3:
                    viewBookings();
                    break;
                case 4:
                    System.out.println("Thank you for using Flight Booking System!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
