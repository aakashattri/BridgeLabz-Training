import java.util.Date;

class Order{
    int orderId;
    Date orderDate;
    Order(int orderId,Date orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    public void getOrderStatus() {
        // TODO Auto-generated method stub
        System.out.println("Order Placed");
    }
}
class ShippedOrder extends Order{
    long trackingNumber;
    ShippedOrder(int orderId, Date orderDate,long trackingNumber) {
        super(orderId, orderDate);
        // TODO Auto-generated constructor stub
        this.trackingNumber=trackingNumber;
    }
    @Override
    public void getOrderStatus() {
        // TODO Auto-generated method stub
        System.out.println("Order Shipped on Your Tracking Number: "+trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder{
    Date deliveryDate;
    DeliveredOrder(int orderId, Date orderDate, long trackingNumber,Date deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        // TODO Auto-generated constructor stub
        this.deliveryDate=deliveryDate;
    }
    @Override
    public void getOrderStatus() {
        // TODO Auto-generated method stub
        System.out.println("Order Delivered on "+deliveryDate);
    }

}
public class OnlineRetailManagementSystemMultilevelInheritance {
    public static void main(String[] args) {
        Order order=new Order(101, new Date());
        ShippedOrder shippedOrder=new ShippedOrder(102, new Date(), 9876543210L);
        shippedOrder.getOrderStatus();
        DeliveredOrder deliveredOrder=new DeliveredOrder(103, new Date(), 1234567890L, new Date());
        deliveredOrder.getOrderStatus();
    }
}