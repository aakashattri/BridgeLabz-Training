import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface RoleAllowed{
    String role();
}
public class RoleBasedAccessControl {
    @RoleAllowed(role="Admin")
    private void adminOnlyAccess() {
        System.out.println("Admin is Accessing the System..");
    }

    public static void main(String[] args)throws Exception {
        RoleBasedAccessControl rbac=new RoleBasedAccessControl();
        Class<?>cls=rbac.getClass();

        Method method=cls.getDeclaredMethod("adminOnlyAccess");

        method.setAccessible(true);

        String currentUser="admin";

        if(method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed annotation=method.getAnnotation(RoleAllowed.class);

            if(annotation.role().equalsIgnoreCase(currentUser)){
                method.invoke(rbac);
            }else {
                System.out.println("Access Denied!");
            }
        }

    }
}