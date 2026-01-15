import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)///to access via reflection
@Target(ElementType.METHOD)
@interface ImportantMethod{
    String level()default "HIGH";
}

public class MarkImportantMethods {
    @ImportantMethod(level="Low")
    public void method1() {
        System.out.println("method1");
    }
    @ImportantMethod(level="Medium")
    public void method2() {
        System.out.println("Method2");
    }
    public static void main(String[] args) {
        MarkImportantMethods impMethods=new MarkImportantMethods();
        Class<?>cls=impMethods.getClass();

        Method[] methods=cls.getDeclaredMethods();
        for(Method meth:methods) {
            if(meth.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation=meth.getAnnotation(ImportantMethod.class);
                System.out.println(
                        "Method Name : " + meth.getName()
                                + " | Level : " + annotation.level()
                );
            }
        }

    }
}