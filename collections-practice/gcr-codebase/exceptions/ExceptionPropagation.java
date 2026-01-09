
public class ExceptionPropagation {
    public int method1(int a)throws ArithmeticException{
        System.out.println("method 1 Running...");
        return a/0;
    }
    public int method2(int method2a) {
        System.out.println("method 2 calling method 1.....");
        return method1(method2a);
    }
    public int method3(int method3a) {
        System.out.println("method 3 calling method 2....");
        return method2(method3a);
    }
    public static void main(String[] args) {
        ExceptionPropagation ex=new ExceptionPropagation();
        int a=10;
        try {
            ex.method3(a);
        } catch (ArithmeticException e) {
            System.out.println("You are dividing number by ZERO.");
        }
    }
}