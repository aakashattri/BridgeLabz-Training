
class Ticket{
    int ticketId;
    String customerName,movieName,seatNumber,bookingTime;
    Ticket next;
    public Ticket(int ticketId,String customerName,String movieName,String seatNumber,String bookingTime){
        this.ticketId=ticketId;
        this.customerName=customerName;
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.bookingTime=bookingTime;
        this.next=null;
    }
}
class TicketReservationSystem{
    private Ticket head;
    public TicketReservationSystem(){
        head=null;
    }
    public void addTicket(int ticketId,String customerName,String movieName,String seatNumber,String bookingTime){
        Ticket newTicket=new Ticket(ticketId,customerName,movieName,seatNumber,bookingTime);
        if(head==null){
            head=newTicket;
            head.next=head;
        }else{
            Ticket temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newTicket;
            newTicket.next=head;
        }
    }
    public void removeTicket(int ticketId){
        if(head==null)return;
        Ticket temp=head,prev=null;
        do{
            if(temp.ticketId==ticketId){
                if(temp==head && temp.next==head){
                    head=null;
                }else{
                    if(temp==head){
                        Ticket last=head;
                        while(last.next!=head){
                            last=last.next;
                        }
                        head=head.next;
                        last.next=head;
                    }else{
                        prev.next=temp.next;
                    }
                }
                return;
            }
            prev=temp;
            temp=temp.next;
        }while(temp!=head);
    }
    public void displayTickets(){
        if(head==null)return;
        Ticket temp=head;
        do{
            System.out.println(
                    "Ticket ID: "+temp.ticketId+
                            " | Customer: "+temp.customerName+
                            " | Movie: "+temp.movieName+
                            " | Seat: "+temp.seatNumber+
                            " | Booking Time: "+temp.bookingTime
            );
            temp=temp.next;
        }while(temp!=head);
    }
    public void searchTicket(String keyword){
        if(head==null)return;
        Ticket temp=head;
        do{
            if(temp.customerName.equalsIgnoreCase(keyword)
                    || temp.movieName.equalsIgnoreCase(keyword)){
                System.out.println(
                        "Found Ticket - ID: "+temp.ticketId+
                                " | Customer: "+temp.customerName+
                                " | Movie: "+temp.movieName
                );
            }
            temp=temp.next;
        }while(temp!=head);
    }
    public int countTickets(){
        if(head==null)return 0;
        int count=0;
        Ticket temp=head;
        do{
            count++;
            temp=temp.next;
        }while(temp!=head);
        return count;
    }
}
public class OnlineTicketReservationSystemCircular{
    public static void main(String[] args){
        TicketReservationSystem system=new TicketReservationSystem();
        system.addTicket(101,"Anurag","The Lost City of Z","G","8:00 PM");
        system.addTicket(102,"Aakash","As the Gods Will","B2","2:30 PM");
        system.addTicket(103,"Priya","Hope","C3","5:00 PM");
        System.out.println("All Ticket Reservations:");
        system.displayTickets();
        System.out.println("Searching for tickets booked by 'Alice Smith':");
        system.searchTicket("Alice Smith");
        System.out.println("\nTotal Tickets Booked: "+system.countTickets());
    }
}