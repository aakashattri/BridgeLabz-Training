import java.lang.reflect.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author{
    String name()default"Your Name";
}


@Author(name="Anurag")
public class RetriveAnnotationAtRuntime {
    public static void main(String[] args) {
        RetriveAnnotationAtRuntime rar=new RetriveAnnotationAtRuntime();
        Class<?>cls=rar.getClass();
        if(cls.isAnnotationPresent(Author.class)) {
            Author annotation=cls.getAnnotation(Author.class);
            System.out.println(annotation.name());
        }

    }
}