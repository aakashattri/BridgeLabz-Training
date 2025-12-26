
interface Worker{
    void performDuties();
}

class Person{
    String name;
    int id;

    Person(String name,int id){
        this.name=name;
        this.id=id;
    }
}

class Chef extends Person implements Worker{

    Chef(String name,int id){
        super(name,id);
    }

    public void performDuties(){
        System.out.println("Chef Name:"+name);
        System.out.println("Chef ID:"+id);
        System.out.println("Preparing food");
    }
}

class Waiter extends Person implements Worker{

    Waiter(String name,int id){
        super(name,id);
    }

    public void performDuties(){
        System.out.println("Waiter Name:"+name);
        System.out.println("Waiter ID:"+id);
        System.out.println("Serving customers");
    }
}

public class RestaurantManagementHybridInheritance{
    public static void main(String[] args){

        Chef chef=new Chef("Aakash",101);
        Waiter waiter=new Waiter("Ravi",102);

        chef.performDuties();
        waiter.performDuties();
    }
}