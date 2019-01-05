package main.java; /**
*Akshay Badiger
*
*Boeing India Pvt Ltd
*
* Stackroute
*/
import java.util.Scanner;
/**This class takes input word and repeats the last n characters n times based on user input
 *
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */
public class RepeatLastChar {
    public static void main(String[] args) {

        /*takes string as a input*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = scan.nextLine();
        System.out.println("enter the number");
        int l = scan.nextInt();

        RepeatLastChar obj = new RepeatLastChar();

        System.out.print(obj.repeatLast(s, l));

    }

    public static String repeatLast(String a, int b) {
        /*input of n*/
        StringBuilder repeat = new StringBuilder();

        repeat.append(a);

        int length = a.length() - b;

        /*prints the word with last n characters n times*/
        String last = "";
        for (int i = 0; i < b; i++) {
            for (int j = length; j < a.length(); j++) {

                repeat.append(a.charAt(j));
            }
        }
        return repeat.toString();

    }
}
