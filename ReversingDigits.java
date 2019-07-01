/*
 * Lisa Marie Schachtschneider
 * Raymundo Quinones
 * James Kwok
 * 
 * CIS 144 Summer 2019
 * 6.26 Reversing Digits
 */

import java.util.Scanner;

public class ReversingDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number and I will reverse it: ");
        int userInput = input.nextInt();
    
        int result = reverse(userInput);
        System.out.printf("reversed number is: %d", result);
    }
    
    public static int reverse(int number) {
        int result = 0;
        
        while(number != 0) {
            int removeLast = number % 10; // remove the last digit to add later
            number = number / 10; // remove the rightmost number and round down
            result = result * 10 + removeLast; // store digits as they accumulate

        }
        return result;    
    }
    
}
