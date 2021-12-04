package autoshop;

public class MyAutoShop {
    public static void main(String[] args) {
        Sedan toyota = new Sedan(500, 500, "red", 30);
        Ford nissanOne = new Ford(300, 300, "black", 2021, 35);
        Ford nissanTwo = new Ford(250, 250, "yellow", 2020, 40);
        Car car = new Car(100, 100, "white");
        System.out.println("Sedan "+toyota.getSalePrice());
        System.out.println("FordOne "+nissanOne.getSalePrice());
        System.out.println("FordTwo "+nissanTwo.getSalePrice());
        System.out.println("car  "+car.getSalePrice());
    }
}