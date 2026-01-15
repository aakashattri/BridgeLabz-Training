import java.lang.reflect.*;
import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

@interface Injection{
}


class Engine{
    void details() {
        System.out.println("Engine is Placed..");
    }
}
class Car{
    @Injection
    Engine engine;
}
public class CustomeDependencyInjection {
    public static <T> T createObject(Class<T>clazz) {
        try {
            T obj=clazz.getDeclaredConstructor().newInstance();
            for(Field field:clazz.getDeclaredFields()) {
                if(field.isAnnotationPresent(Injection.class)) {
                    field.setAccessible(true);
                    Object dependency=field.getType().getDeclaredConstructor().newInstance();
                    field.set(obj, dependency);
                }
            }
            return obj;
        }catch(Exception e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) {
        Car car=CustomeDependencyInjection.createObject(Car.class);
        car.engine.details();


    }
}