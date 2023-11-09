import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        System.out.println("enter a number. i will tell you if it is a perfect square");
        if (scan.hasNextInt()) {
            number = scan.nextInt();
            if (Math.sqrt(number)%1 == 0) {
                System.out.println("your number is a perfect square");
            }else{
                System.out.println("not a perfect square");
            }
        }else{
            System.out.println("you've entered something invalid.");
        }

    }
}