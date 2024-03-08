package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(1990);
        Motorbike motorbike = new Motorbike("BMW", "Blue", 2001);
        int differenceCar = car.yearDifference(2009);
        int differenceMotorbike = motorbike.yearDifference(1996);
        System.out.println(differenceCar);
        System.out.println(differenceMotorbike);

    }
}
