
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}
public class CachingSystem {

    @CacheResult
    public int slowSquare(int number) {
        System.out.println("Computing square for: " + number);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number * number;
    }
    private static final HashMap<String, Object> cache = new HashMap<>();

    public static Object execute(Object obj, String methodName, Object... args)
            throws Exception {

        Class<?> cls=obj.getClass();

        Class<?>[] paramTypes=new Class[args.length];
        for (int i=0;i<args.length;i++) {
            if (args[i] instanceof Integer) {
                paramTypes[i]=int.class;
            } else {
                paramTypes[i]=args[i].getClass();
            }
        }
        Method method=cls.getDeclaredMethod(methodName, paramTypes);
        method.setAccessible(true);

        String cacheKey=methodName + Arrays.toString(args);

        if (method.isAnnotationPresent(CacheResult.class)) {

            if (cache.containsKey(cacheKey)) {
                System.out.println("Returning cached result...");
                return cache.get(cacheKey);
            }
            Object result=method.invoke(obj, args);
            cache.put(cacheKey, result);
            return result;
        }
        return method.invoke(obj, args);
    }
    public static void main(String[] args) throws Exception {
        CachingSystem service=new CachingSystem();
        System.out.println(execute(service,"slowSquare", 5));
        System.out.println(execute(service,"slowSquare", 5));
        System.out.println(execute(service,"slowSquare", 6));
        System.out.println(execute(service,"slowSquare", 6));
    }
}