import java.lang.reflect.*;
import java.lang.annotation.*;



interface Greeting{
    void display(String message);
}

class Greeter implements Greeting{
    @Override
    public void display(String message) {
        System.out.println(message);
    }

}
public class LoggingProxy implements InvocationHandler{

    private final Object target;

    public LoggingProxy(Object target) {
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("[Log] Before Method "+method.getName());
        Object result=method.invoke(target, args);
        System.out.println("[Log] After method "+method.getName());
        return result;
    }
    public static void main(String[] args) {
        Greeting greeter=new Greeter();

        Greeting loggingProxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxy(greeter)
        );

        loggingProxy.display("Hello");
    }
}