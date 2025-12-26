package oops.object_modelling;

import java.util.ArrayList;
import java.util.List;
class Product {
    private String name;
    private double price;

    public Product( String name , double price ){
        this.name=name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice( ){
        return price;
    }
}
class Order {
    private static int orderCounter = 1;
    private int orderId;
    private List<Product> products;
    private Customers customer;
    public Order( Customers customer ){
        orderId = orderCounter++;
        this.customer=customer;
        products=new ArrayList<>();
    }
    public void addProduct( Product product ){
        products.add( product );
    }
    public void showOrderDetails(){
        System.out.println("Order ID: "+orderId+" | Customer: "+customer.getName());
        System.out.println("Products in Order:");
        for( Product product : products ){
            System.out.println(" - "+product.getName()+" ("+product.getPrice()+")");
        }
    }
}
class Customers{
    private String name;
    private List<Order> orders;

    public Customers(String name){
        this.name = name;
        orders=new ArrayList<>();
    }
    public String getName( ){
        return name;
    }
    public Order placeOrder(){
        Order order=new Order(this);
        orders.add( order );
        return order;
    }
    public void showOrderHistory(){
        System.out.println("Order History for "+name+":");
        for(Order order:orders){
            order.showOrderDetails();
            System.out.println();
        }
    }
}
public class EcommersSystem {
    public static void main(String[] args){
        Product laptop = new Product("Laptop",1000.0);
        Product phone=new Product("Smartphone", 600.0);
        Product headphones = new Product("Headphones",150.0);
        Customers customer1=new Customers("Aditya");
        Customers customer2 = new Customers("Yash");
        Order aliceOrder = customer1.placeOrder();
        aliceOrder.addProduct(laptop);
        aliceOrder.addProduct( headphones );

        Order bobOrder=customer2.placeOrder();
        bobOrder.addProduct(phone);
        customer1.showOrderHistory();
        customer2.showOrderHistory( );
    }
}

