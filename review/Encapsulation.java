public class Encapsulation {

    private String  name ;

    public String getter(){

        return name;

    }
    public void setter(String str){
        this.name = str ;
    }

    public static void main(String[] args)
    {
        Encapsulation e = new Encapsulation() ;

        e.setter("aakash");
        String name = e.getter();


        System.out.println(name) ;

    }
}
