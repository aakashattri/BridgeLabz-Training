class HospitalUnit {
    String name;
    boolean available;
    HospitalUnit next;

    HospitalUnit(String name, boolean available) {
        this.name=name;
        this.available=available;
        this.next=null;
    }
}

class AmbulanceRouteDemo{
    private HospitalUnit head=null;
    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit=new HospitalUnit(name, available);
        if (head==null) {
            head=newUnit;
            newUnit.next=head;
            return;
        }
        HospitalUnit temp=head;
        while (temp.next!=head) {
            temp=temp.next;
        }
        temp.next=newUnit;
        newUnit.next=head;
    }
    public void findNearestAvailableUnit() {
        if (head==null) {
            System.out.println("No hospital units available.");
            return;
        }

        HospitalUnit temp=head;
        while (temp!=head){
            if (temp.available) {
                System.out.println("Patient redirected to: " + temp.name);
                return;
            }
            temp = temp.next;
        }

        System.out.println("No units available at the moment.");
    }

    public void removeUnit(String unitName) {
        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        while (curr != head);{
            if (curr.name.equals(unitName)) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        HospitalUnit last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }
                System.out.println(unitName + " removed (under maintenance).");
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public void displayRoute() {
        if (head == null) return;

        HospitalUnit temp = head;
        System.out.print("Ambulance Route: ");
        do {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to " + head.name + ")");
    }
}
public class AmbulanceRoute{
    public static void main(String[] args) {
        AmbulanceRouteDemo route = new AmbulanceRouteDemo();
        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);
        route.displayRoute();
        route.findNearestAvailableUnit();
        route.removeUnit("Radiology");
        route.displayRoute();

        route.findNearestAvailableUnit();
    }
}