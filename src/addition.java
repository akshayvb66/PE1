/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
import java.util.*;

/**This class takes input character and checks if the entered character is alphabet or digit or special character
 *
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */

public class addition {

    public static void main(String[] args)
    {

        /*Takes the number and if user wants to end he can enter zero*/
        int number,total=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers and enter zero to end: ");

        /*Adds all the numbers and displays the sum*/
        while ((number = scan.nextInt()) != 0) {
            total += number;
        }
        System.out.println("Sum of all numbers is "+total);
    }
}