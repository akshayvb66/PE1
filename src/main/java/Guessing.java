package main.java; /**
*Akshay Badiger
*
*Boeing India Pvt Ltd
*
* Stackroute
*/
import java.util.Scanner;
/**This class takes input number and displays if the user is guessing the right number
 *
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */
public class Guessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean b=false;
        int value   =37;
        while(b==false) {
	/*Let the user guess the number*/
            System.out.println("Guess your number");

            int n = scan.nextInt();
            if (n == value) {
	/*if the user has entered the right number*/
                b=true;
                System.out.println("Number guessed matches the original number");
            }
	/*if the user has entered slightly higher number */
            else if (n > value) {
                System.out.println(" Number guessed is more than original number");
            }
	/*if it is less than original*/
            else if (n < value) {

                System.out.println(" Number guessed is less than original number");
            }

        }
    }
}
