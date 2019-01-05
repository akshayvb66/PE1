package main.java; /**
*Akshay Badiger
*
*Boeing India Pvt Ltd
*
* Stackroute
*/
import java.util.*;
import java.util.Scanner;
import java.util.Scanner;


/**This class takes input word and reverses it
 *
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */
public class StringReverse {

    public static void main(String[] args) {

        /*taking the string input*/
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String s = sc.nextLine();
        StringReverse obj = new StringReverse();
        obj.ReverseString(s);
    }

    public String ReverseString(String a){

        String str2 = "";

	/*reversing it using for loop*/
        for (int i=a.length()-1; i>=0; i--) {
            str2 += a.charAt(i);
        }

        System.out.println(str2);
        return str2;

    }
}
