import java.lang.reflect.*;
class Person{
    private int age=22;
}
public class AccessPrivateField {
    public static void main(String[] args) throws Exception{
        Person person=new Person();
        Class<?> cls=person.getClass();

        Field field=cls.getDeclaredField("age");
        field.setAccessible(true);

        System.out.println("Old value: "+field.get(person));
        field.set(person,26);

        System.out.println("New Valu: "+field.get(person));


    }
}