package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Worker worker1 = new Picker(0, false);
        Worker worker2 = new Courier(0, false);
        System.out.println(warehouse);
        businessProcess(worker1);
        businessProcess(worker2);

    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i <10000; i++) {
            worker.doWork();
        }

        System.out.println(worker.toString());
        worker.bonus();

    }
}
