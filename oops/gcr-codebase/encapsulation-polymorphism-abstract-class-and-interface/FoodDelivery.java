
interface Discountable{
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem{
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String n,double p,int q){
        itemName=n;
        price=p;
        quantity=q;
    }
    public double getPrice(){return price;}
    public int getQuantity(){return quantity;}
    abstract double calculateTotalPrice();
}
class VegItem extends FoodItem{
    VegItem(String n,double p,int q){
        super(n,p,q);	}
    double calculateTotalPrice(){
        return getPrice()*getQuantity();
    }
}
class NonVegItem extends FoodItem implements Discountable{
    NonVegItem(String n,double p,int q){
        super(n,p,q);
    }
    double calculateTotalPrice(){
        return getPrice()*getQuantity()+50;
    }
    public double applyDiscount(){
        return 20;
    }
    public String getDiscountDetails(){
        return "Flat 20";
    }
}
public class FoodDelivery{
    public static void main(String[] args){
        FoodItem f=new NonVegItem("Chicken",200,2);
        System.out.println(f.calculateTotalPrice());
    }
}