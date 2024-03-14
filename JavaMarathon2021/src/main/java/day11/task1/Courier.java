package day11.task1;

public class Courier implements Worker {
    private float salary;
    private boolean isPayed= false;

    private Warehouse warehouse;

    {
        warehouse = new Warehouse();
        warehouse.getCountPickedOrders();
    }

    Courier(float salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;

    }

    public float getSalary() {
        salary += 100;
        return salary;
    }

    public boolean isPayed() {
        isPayed =true;
        return isPayed;
    }

    public void doWork() {
        getSalary();
        warehouse.getCountDeliveredOrders();

    }

    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        }
        else if (warehouse.getCountDeliveredOrders() == 10001) {
            salary += 50000;
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
