import java.util.Scanner;

public class CreateDatabase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");

        double height  = sc.nextDouble();
        System.out.println("Enter height");
        double weight = sc.nextDouble();

        if (height >= 5.5 &&  height <= 6.5) {
            if (weight >= 50 &&  weight <= 75) {
            
            } else {
                System.out.println("Eligible");

            }
        } 
        else {
            System.out.println("Eligible");
        }



    }
}