package main.java; /**This class takes input character and checks if the entered character is alphabet or digit or special character
 *
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */
import java.util.Scanner;
import java.util.*;
/**This class takes number from the user and sort the digits in increasing order and displays the sum of digits
 * if sum is below 15 it will print false or else true
 *
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */

public class Sorted {
    public static void main(String[] args) {

        /*getting input from user*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to sort and find even sum");
        String s = scan.nextLine();
        int length = s.length();
        String res="";

        /*sorting the number in decreasing*/
        int arr[] = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<length;i++)
        {
            arr[(s.charAt(i)-'0')]++;
        }
        for(int i=9;i>=0;i--)
        {
            for(int j=0;j<arr[i];j++) {
                res += (char) (i + 48);
            }
        }


        /*calculating the sum of digits*/
        System.out.println(res);
        int sum = arr[2]*2 + arr[4]*4 + arr[6]*6 + arr[8]*8;
        System.out.println("Sum of even numbers is : " +sum);
        if(sum > 15) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
