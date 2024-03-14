package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;



    public int getCountPickedOrders() {
        countPickedOrders++;
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        countDeliveredOrders++;
        return countDeliveredOrders;
    }


    @Override
    public String  toString() {
        return "Warehouse{" +
                "countPickedOrders=" + getCountPickedOrders() +
                ", countDeliveredOrders=" + getCountDeliveredOrders() +
                '}';
    }
}
