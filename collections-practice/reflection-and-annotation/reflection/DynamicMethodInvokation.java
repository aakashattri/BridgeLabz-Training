import java.lang.reflect.*;

class MathOperations{
    public int addition(int a,int b) {
        return a+b;
    }
    public int substraction(int a,int b) {
        return a-b;
    }
    public int multiply(int a,int b) {
        return a*b;
    }
    public int division(int a,int b) {
        return a/b;
    }
}
public class DynamicMethodInvokation {
    static final Object execute(Object obj,String methodName,Object...args)throws Exception {
        Class<?>cls=obj.getClass();

        Class<?>[]paramType=new Class[args.length];
        for(int i=0;i<args.length;i++) {
            if(args[i] instanceof Integer) {
                paramType[i]=int.class;
            }else {
                paramType[i]=args[i].getClass();
            }
        }
        Method method=cls.getDeclaredMethod(methodName, paramType);
        method.setAccessible(true);

        return method.invoke(obj, args);

    }
    public static void main(String[] args) throws Exception{
        MathOperations math = new MathOperations();

        System.out.println(execute(math, "addition", 4, 5));
        System.out.println(execute(math, "substraction", 10, 3));
        System.out.println(execute(math, "multiply", 6, 7));
    }
}
