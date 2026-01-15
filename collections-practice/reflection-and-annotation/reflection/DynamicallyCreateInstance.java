import java.lang.reflect.*;
class People{
    private String name;
    People(String name){
        this.name=name;
    }
}
public class DynamicallyCreateInstance {
    public static void main(String[] args) throws Exception{
        People p1=new People("Anurag");
        Class<?>cls=p1.getClass();

        Constructor<?>cons=cls.getDeclaredConstructor(String.class);
        cons.setAccessible(true);
        People people=(People) cons.newInstance("Aakash");

        Field nameField = cls.getDeclaredField("name");
        nameField.setAccessible(true);

        System.out.println(nameField.get(people));

    }
}