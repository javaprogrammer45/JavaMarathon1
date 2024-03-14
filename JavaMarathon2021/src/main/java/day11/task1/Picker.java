package day11.task1;

public class Picker implements Worker {
    private float salary;
    private boolean isPayed = false;

    private Warehouse warehouse;

    {
        warehouse = new Warehouse();

    }

    Picker(float salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;

    }

    public float getSalary() {
        salary += 80;
        return salary;
    }

    public boolean isPayed() {
        isPayed = true;
        return isPayed;
    }

    public void doWork() {
        getSalary();
       warehouse.getCountPickedOrders();
    }


    public void bonus() {
        System.out.println(warehouse.toString());
        if (isPayed) {
            System.out.println(
                    "Бонус уже был выплачен");}

       else if (warehouse.getCountPickedOrders() == 10001) {
            salary += 70000;
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

