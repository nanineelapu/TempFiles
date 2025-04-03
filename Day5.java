public class Day5 {
    public static void main(String[] args) {
    
        Car car = new Car();
        car.brand =  "Toyota";
        car.colour = "white";
        car.myear = 2022;
        car.mileage = 330.32;
        car.maxspeed = 150;
        car.isType = true;

        // System.out.println(car.brand);
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();
        // System.out.println();
        
    }
}
//OOPS
class Car{
    String brand;
    String colour;
    int myear;
    double mileage;
    double maxspeed;
    boolean isType;



    void running() {
        System.out.println("Car is running");
    }

    void stop() {
        System.out.println("Car is stopped");
    }

    void accclerate() {
        System.out.println("Car is running at Speed" + maxspeed);
    }
    void type(boolean isType){
        System.out.println("This car type is Petrol " + isType);
    }
}
