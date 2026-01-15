
import java.lang.reflect.Method;

public class MethodExecutionTime {
    void runningTask() {
        System.out.println("Running Task");
    }
    void standBy() {
        System.out.println("Just Standing");
    }
    public static void executeWithTiming(Object obj) {
        Method[]methods=obj.getClass().getDeclaredMethods();
        for (Method method:methods) {
            if (method.getParameterCount()==0) {
                try {
                    method.setAccessible(true);
                    long start=System.nanoTime();
                    method.invoke(obj);
                    long end=System.nanoTime();
                    System.out.println(
                            method.getName()+ " executed in "+(end-start)+" ns"
                    );
                } catch (Exception ignored){}
            }
        }
    }
    public static void main(String[] args) {
        MethodExecutionTime met=new MethodExecutionTime();

        executeWithTiming(met);
    }
}
