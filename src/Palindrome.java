/**
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

    public static void main(String[] args)

    {
	/*Taking the number as input*/
        int originalNumber,number,reverseNumber=0,remainder,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        originalNumber=scan.nextInt();
        number=originalNumber;

	/*chech if its a palindrome*/
        while(number!=0)
        {
            remainder=number%10;
            if(remainder%2==0)
            {
                sum=sum+remainder;
            }
            reverseNumber=reverseNumber*10+remainder;
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
