
class Animal{
    String name;
    int age;
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void makeSound() {
        System.out.println("Animal Sound:->)))");
    }
}
class Dog extends Animal{
    Dog(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void makeSound() {
        System.out.println("Dog Sound:->)))");
    }

}
class Cat extends Animal{
    Cat(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void makeSound() {
        System.out.println("Cat Sound:->)))");
    }

}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog=new Dog("Tommy",12);
        dog.makeSound();
        Animal cat=new Cat("Bitch",4);

        cat.makeSound();
    }
}