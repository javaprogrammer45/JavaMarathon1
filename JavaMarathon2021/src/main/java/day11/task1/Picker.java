package day11.task1;

public class Picker implements Worker {
    final int BONUS = 70000;
    final int PRICE_SALARY = 80;

    private float salary;
    private boolean isPayed = false;

    private Warehouse warehouse;

    Picker(float salary, boolean isPayed, Warehouse warehouse) {
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
        warehouse.incrementCountPickedOrders();
        warehouse.getCountPickedOrders();
    }


    public void bonus() {

        if (isPayed) {
            System.out.println(
                    "Бонус уже был выплачен");
        } else if (warehouse.getCountPickedOrders() == 10000) {
            salary += BONUS;
            isPayed();

        } else {
            System.out.println("Бонус пока не доступен");

        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}

