import java.lang.reflect.*;
class Calculator {
    private int addition(int a,int b) {
        return a+b;
    }
    private int substraction(int a,int b) {
        return a-b;
    }
    private int multiply(int a,int b) {
        return a*b;
    }
    private int division(int a,int b) {
        return a/b;
    }
}
public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception{
        Calculator calc=new Calculator();
        Class<?>cls=calc.getClass();

        Method method=cls.getDeclaredMethod("addition",int.class,int.class);
        method.setAccessible(true);
        int result=(int)method.invoke(calc, 5,7);

        System.out.println("Result: "+result);

    }
}