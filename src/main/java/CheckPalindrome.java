package main.java; /**
*Akshay Badiger
*
*Boeing India Pvt Ltd
*
* Stackroute
*/
import java.util.*;
/**This class takes input word and checks if it is palindrome and calculates the sum of digits 
 *if sum is below 25 or above
 *
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */

public class CheckPalindrome {

    public static void main(String[] args) {
        /*Taking the number as input*/
        int originalNumber, number, reverseNumber = 0, sum=0,num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        originalNumber = scan.nextInt();
        num = originalNumber;

        System.out.println((num));

        CheckPalindrome obj= new CheckPalindrome();

        reverseNumber= obj.palindromeTrue(num);
        sum=obj.CheckSum(num);


        if(num==reverseNumber)
        {
            System.out.print("The given Number"+num+" is a palindrome ");
        }
        else
        {
            System.out.print("The given Number"+num+" is a not palindrome ");

        }

        /*displays the sum of digits */
        if(sum<25)
        {
            System.out.print("and sum is less than 25");
        }
        else
        {
            System.out.print("and sum is greater than 25");
        }

    }

    public int palindromeTrue(int a) {
        /*check if its a palindrome*/

        int reverseNumber = 0, reminder, sum = 0;

        while (a != 0) {
            reminder = a % 10;
            if (reminder % 2 == 0) {
                sum = sum + reminder;
            }
            reverseNumber = reverseNumber * 10 + reminder;
            a = a / 10;

        }
        return reverseNumber;
    }

    public int CheckSum(int number){

        int remainder=0,sum=0;
        while(number!=0)   //Loop to reverse a number
        {

            remainder = number % 10;
            if (remainder % 2 == 0) {
                sum = sum + remainder;
            }
            number = number / 10;
        }

        return sum;


    }


}
