/**
*Akshay Badiger
*
*Boeing India Pvt Ltd
*
* Stackroute
*/
import java.util.*;
import java.util.Scanner;

/**This class takes input word and reverses it
 *
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */
public class stringreverse {

    public static void main(String[] args) {
	
	/*taking the string input*/
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");

        name = sc.nextLine();


        String str1 = name;
        String str2 = "";

	/*reversing it using for loop*/
        for (int i=str1.length()-1; i>=0; i--) {
            str2 += str1.charAt(i);
        }

        System.out.println(str2);

    }
}
