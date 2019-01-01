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
public class Repeat {
    public static void main(String[] args) {

	/*takes string as a input*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = scan.nextLine();
	
	/*input of n*/
        System.out.println("enter the number");
        int      l = scan.nextInt();
        int     length = s.length();

	/*prints the word with last n characters n times*/
        System.out.print(s);
        String   last ="";
        for(int i=length-l;i<length;i++){
            last = last+s.charAt(i);
        }
        for (int j = 0; j < l; j++) {
            System.out.print(last);
        }

    }
}
