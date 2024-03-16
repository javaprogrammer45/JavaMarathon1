package day11.task1;

public class Courier implements Worker {
    final int BONUS = 50000;
    final int PRICE_SALARY = 100;
    private float salary;
    private boolean isPayed = false;

    private Warehouse warehouse;


    Courier(float salary, boolean isPayed, Warehouse warehouse) {
        this.warehouse = warehouse;
        this.salary = salary;
        this.isPayed = isPayed;

    }

    public float getSalary() {
        salary += PRICE_SALARY;
        return salary;
    }

    public boolean isPayed() {
        isPayed = true;
        return isPayed;
    }

    public void doWork() {
        getSalary();
        warehouse.incrementCountDeliveredOrders();
        warehouse.getCountDeliveredOrders();
    }

    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountDeliveredOrders() == 10000) {
            salary += BONUS;
            isPayed();

        } else {
            System.out.println("Бонус пока не доступен");

        }

    }


    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
