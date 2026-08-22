package basics.class_problems;

import java.util.*;
public class palindrome {
    public static void main (String[]args){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number=sc.nextInt();
        int origNumber=number;
        int revNumber=0;
        while(number>0){
            int digit= number%10;
            revNumber=(revNumber*10)+digit;
            number=number/10;
        }
        boolean isPalindrome=(origNumber==revNumber);
        System.out.println(" Is the number: "+ origNumber +" a palindrome: "+isPalindrome);
    

    }
   
}
