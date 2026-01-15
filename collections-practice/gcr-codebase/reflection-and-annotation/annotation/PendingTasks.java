import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface Todo{
    String task();
    String assignedTo();
    String priority()default "MEDIUM";

}

public class PendingTasks {

    @Todo(task="Eating Foood",assignedTo="Anurag",priority="IMPORTANT")
    void task1() {

    }
    @Todo(task=" Playing Cricket",assignedTo="Anurag",priority="NON-IMPORTANT")
    void task2() {

    }
    @Todo(task="Sleeping",assignedTo="Aditya",priority="seviour")
    void task3() {

    }
    public static void main(String[] args) {
        PendingTasks pendingTasks=new PendingTasks();
        Class<?> cls=pendingTasks.getClass();

        Method[]methods=cls.getDeclaredMethods();

        for(Method method:methods) {
            if(method.isAnnotationPresent(Todo.class)) {
                Todo annotation=method.getAnnotation(Todo.class);

                System.out.println("Method Name : "+method.getName()
                        + "\n Task : "+annotation.task()
                        +"\n Assigned To: "+annotation.assignedTo()
                        +"\n Priority : "+annotation.priority());
                System.out.println("-------------------------");
            }
        }
    }
}