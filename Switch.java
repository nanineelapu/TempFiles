
import java.util.Scanner;
public class Switch {
public static void main(String[] args) {
	Scanner src=new Scanner(System.in);
	double balance=1000.0;
	System.out.println("\t1.check balance"+"\n"+"\t2.deposit"+"\n"+"2\t3.withdrawl"+"\n"+"\t4.exit"+"\n"+"\t5.choose a option");
    int choice = src.nextInt();
     
     switch (choice) {
         case 1:
             System.out.println("Your balance: Rs." + balance);
             break;
         
         case 2:
             System.out.print("Enter deposit amount: Rs.");
             double deposit = src.nextDouble();
             balance += deposit;
             System.out.println("Rs." + deposit + " deposited successfully.");
             break;
         
         case 3:
             System.out.print("Enter withdrawal amount: Rs.");
             double withdraw = src.nextDouble();
             balance -= withdraw;
             System.out.println("Rs." + withdraw + " withdrawn successfully.");
             break;
         
         case 4:
             System.out.println("Exiting...");
             break;
         
         default:
             System.out.println("Invalid choice!");
	}
}}