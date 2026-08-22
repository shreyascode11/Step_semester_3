package basics.class_problems;
import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        
        int origNumber = number;
        int sum = 0;
        

        while (number != 0) {
            int digit = number % 10;

            sum = sum + (digit * digit * digit);
            number = number / 10;
        }
        

        if (sum == origNumber) {
            System.out.println("Is the number an Armstrong number? Yes");
        } else {
            System.out.println("Is the number an Armstrong number? No");
        }
        
        sc.close();
    }
}