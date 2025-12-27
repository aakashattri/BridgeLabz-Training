
interface tax{
    double calculateTax();
    String getTaxDetails();
}
abstract class Product{
    private int productId;
    private String name;
    private double price;
    Product(int productId,String name,double price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }
    public double getPrice(){return price;}
    abstract double calculateDiscount();
}
class Electronics extends Product implements tax{
    Electronics(int id,String name,double price){
        super(id,name,price);
    }
    double calculateDiscount(){
        return getPrice()*0.1;
    }
    public double calculateTax(){
        return getPrice()*0.18;
    }
    public String getTaxDetails(){
        return "GST 18%";
    }
}
class Clothing extends Product{
    Clothing(int id,String name,double price){
        super(id,name,price);
    }
    double calculateDiscount(){
        return getPrice()*0.2;
    }
}
class Groceries extends Product{
    Groceries(int id,String name,double price){
        super(id,name,price);
    }
    double calculateDiscount(){
        return getPrice()*0.05;
    }
}
public class Ecommerce{
    public static void main(String[] args){
        Product p=new Electronics(1,"Laptop",60000);
        tax t=(tax)p;
        System.out.println(p.getPrice()+t.calculateTax()-p.calculateDiscount());
    }
}