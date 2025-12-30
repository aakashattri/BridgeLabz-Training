
class Node{
    Student student;
    Node next;
    Node(Student student){
        this.student=student;
        this.next=null;
    }
}
class Student{
    String name;
    int rollNumber;
    int age;
    char grade;
    Student(String name,int rollNumber,int age,char grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.age=age;
        this.grade=grade;
    }
}
class StudentLinkedList {
    private Node head;
    public void addAtBeginning(Student student) {
        Node newNode=new Node(student);
        newNode.next=head;
        head =newNode;
    }
    public void addAtEnd(Student student) {
        Node newNode= new Node(student);
        if (head ==null) {
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void deleteByRollNumber(int rollNumber) {
        if (head== null) return;

        if (head.student.rollNumber==rollNumber) {
            head =head.next;
            return;
        }

        Node prev=head;
        Node curr=head.next;

        while (curr!=null) {
            if (curr.student.rollNumber== rollNumber) {
                prev.next = curr.next;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
    }
    public Student searchByRollNumber(int rollNumber) {
        Node temp=head;
        while (temp!=null) {
            if (temp.student.rollNumber==rollNumber) {
                return temp.student;
            }
            temp=temp.next;
        }
        return null;
    }
    public void updateGrade(int rollNumber, char newGrade) {
        Student student=searchByRollNumber(rollNumber);
        if (student!=null) {
            student.grade=newGrade;
        }
    }
    public void displayAll() {
        Node temp=head;
        while (temp!=null) {
            Student s=temp.student;
            System.out.println(
                    "Roll: "+s.rollNumber +
                            ", Name: "+s.name +
                            ", Age: "+s.age +
                            ", Grade: "+s.grade
            );
            temp=temp.next;
        }
    }
}
public class StudentReportManagementSingle {
    public static void main(String[] args) {
        StudentLinkedList list=new StudentLinkedList();
        list.addAtBeginning(new Student("Anurag",12,22,'A'));
        list.addAtEnd(new Student("Rahul",15,21,'B'));
        list.addAtEnd(new Student("Neha",18,20,'A'));
        System.out.println("All Students:");
        list.displayAll();
        System.out.println("Updating grade of roll 15...");
        list.updateGrade(15, 'A');
        System.out.println("After Update:");
        list.displayAll();
        System.out.println("Deleting roll 12...");
        list.deleteByRollNumber(12);
        System.out.println("After Deletion:");
        list.displayAll();
    }
}