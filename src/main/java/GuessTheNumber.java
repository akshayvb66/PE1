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
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

	/*Let the user guess the number*/

        int a = scan.nextInt();
        System.out.println(guessTheNumber(a));
    }

    public static String guessTheNumber(int n){
        int value   =45;
            System.out.println("Guess your number");

            if (n == value) {
	/*if the user has entered the right number*/

              return "Number guessed matches the original number";
            }
	/*if the user has entered slightly higher number */
            else if (n > value) {
               return "Number guessed is more than original number";
            }
	/*if it is less than original*/
            else {

                return "Number guessed is less than original number";
            }

        }
    }

