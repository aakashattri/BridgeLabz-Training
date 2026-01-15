
import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime{
    String message()default"Method Executed in ";
}
public class LogginMethodExecutionTime {
    @LogExecutionTime(message="Method 1 Executed in ")
    void method1() {
        int a=23;
        int b=35;
        System.out.println("Method1 result : "+(a+b));
    }
    public static void main(String[] args) throws Exception{
        LogginMethodExecutionTime lmet=new LogginMethodExecutionTime();
        Class<?>cls=lmet.getClass();

        Method method=cls.getDeclaredMethod("method1");

        if(method.isAnnotationPresent(LogExecutionTime.class)) {
            LogExecutionTime annotation=method.getAnnotation(LogExecutionTime.class);

            long startTime=System.currentTimeMillis();
            lmet.method1();
            long endTime=System.currentTimeMillis();

            System.out.println(annotation.message()+(endTime-startTime)+"ms");
        }


    }
}