import java.util.*;

public class TrafficManager {

    class Node {
        Node next;
        String carNumber;

        Node(String carNumber) {
            this.carNumber = carNumber;
            this.next = null;
        }
    }

    public Node makeNodes(String name) {
        return new Node(name);
    }

    public static void printParking(Node head) {

        if (head == null) {
            System.out.println("Parking Empty");
            return;
        }

        Node temp = head;
        int n = 1;

        do {
            System.out.println("Serial Number " + n + " Car Number : " + temp.carNumber);
            temp = temp.next;
            n++;
        } while (temp != head);
    }

    public static int countParking(Node head) {
        if (head == null) return 0;

        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int QUEUE_SIZE = 3;
        int PARKING_LIMIT = 2;

        Queue<Node> carQueue = new ArrayDeque<>();
        TrafficManager obj = new TrafficManager();

        Node head = null;
        Node tail = null;

        while (true) {

            System.out.println("Enter car number (or exit): ");
            String carNumber = sc.nextLine();

            if (carNumber.equalsIgnoreCase("exit"))
                break;


            if (carQueue.size() == QUEUE_SIZE) {
                System.out.println("Queue Overflow : Waiting area full");
                continue;
            }

            Node carNode = obj.makeNodes(carNumber);
            carQueue.add(carNode);
            System.out.println("Car added to queue");


            int parkedCars = countParking(head);

            if (parkedCars == PARKING_LIMIT) {
                System.out.println("Parking Full : Car waiting in queue");
                continue;
            }

            Node enteringCar = carQueue.remove();

            if (head == null) {
                head = enteringCar;
                tail = enteringCar;
                tail.next = head;
            } else {
                tail.next = enteringCar;
                tail = enteringCar;
                tail.next = head;
            }

            System.out.println("Car entered parking");
            printParking(head);
        }
    }
}
