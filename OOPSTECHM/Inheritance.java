package OOPSTECHM;

public class Inheritance {
    public static void main(String[] args) {
        Moto moto = new Moto();
        moto.brand = "Motorola";
        moto.weight = 170;
        moto.processor = "Snapdragon 720G";
        moto.os = "Android 13";
        moto.display = true;
        moto.price = 15000;
        moto.pannel = "OLED";
        moto.batteryMah = "4500mAh";
        moto.cameras = 12;
        moto.android = "Pie";
        moto.ram = 4;
        moto.rom = 64;
        // moto.processorName = "Snapdragon 720G";
    }
}

class Phones{
    String brand;
    double weight;
    String processor;
    String os;
    boolean display;
    int price;

    void working() {
        System.out.println("Mobile is Working ");
    }
    void appsAvailabe() {
        System.out.println("Apps are availabe");
    }

}

class Moto extends Phones{
    String pannel;
    String batteryMah;
    int cameras;
    String android;
    int ram;
    int rom;
    String processorName;

}
class Nothing extends Phones{

}