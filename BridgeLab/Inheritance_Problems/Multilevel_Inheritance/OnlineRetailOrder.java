package InheritanceProblem.Multilevel_Inheritance;

class Order {
    int orderId;
    Order(int orderId) { this.orderId = orderId; }
    void getOrderStatus() { System.out.println("Order Placed: " + orderId); }
}

class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(int orderId, String trackingNumber) {
        super(orderId);
        this.trackingNumber = trackingNumber;
    }
    @Override
    void getOrderStatus() { System.out.println("Order Shipped: " + trackingNumber); }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int orderId, String trackingNumber, String deliveryDate) {
        super(orderId, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    void getOrderStatus() { System.out.println("Delivered on: " + deliveryDate); }
}

public class OnlineRetailOrder {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(101, "TRK123", "2025-09-22");
        d.getOrderStatus();
    }
}

