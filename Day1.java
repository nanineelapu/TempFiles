import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t1" + "\n" + "\t2");
        System.out.println("Select your vote");
        int vote = sc.nextInt();
        
        switch (vote) {
            case 1:
                System.out.println("Voted YSRCP");
                break;
            case 2:
                System.out.println("Voted JANASENA");
                break;
            case 3:
                System.out.println("Voted TDP");
                break;
            case 4:
                System.out.println("Voted CONGRESS");
                break;
            case 5:
                System.out.println("Voted PRAJADESHAM");
                break;
        
            default:
            System.out.println("Invalid Option");
                break;
        }
    }
}
