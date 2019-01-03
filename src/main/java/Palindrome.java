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

public class Palindrome {

    public static void main(String[] args) {
        /*Taking the number as input*/
        int originalNumber, number, reverseNumber = 0, reminder, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        originalNumber = scan.nextInt();
        number = originalNumber;

        System.out.println((number));


    /*check if its a palindrome*/
        while(number!=0)
        {
            reminder=number%10;
            if(reminder%2==0)
            {
                sum=sum+reminder;
            }
            reverseNumber=reverseNumber*10+reminder;
            number=number/10;

        }



        if(originalNumber==reverseNumber)
        {
            System.out.print("The given Number"+originalNumber+" is a palindrome ");
        }
        else
        {
            System.out.print("The given Number"+originalNumber+" is a not palindrome ");

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


}
