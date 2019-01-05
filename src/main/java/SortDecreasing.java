package main.java; /**This class takes input character and checks if the entered character is alphabet or digit or special character
 *
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */
import java.util.Scanner;
import java.util.*;
/**This class takes number from the user and sort the digits in decreasing order and displays the sum of digits
 * if sum is below 15 it will print false or else true
 *
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */

public class SortDecreasing {


    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to sort");
        int     num = 0,sum=0;
        num = scanner.nextInt();
        SortDecreasing myObj=new SortDecreasing();
        myObj.sortedNum(num);
        myObj.sumOfNum(num);
    }

    public String sortedNum(int b)
    {
        StringBuilder result = new StringBuilder();

        float   sum = 0;
        int    array[] = new int[10];
        for(int  i=0;i<10;i++){
            array[i] = 0;
        }        while (((b%10)>0) || (b > 0)){
        array[b%10]++;
        b = b/10;
    }
        System.out.print("Sorted number in non-increasing order : ");
        for(int  i=9;i>=0;i--){
            while(array[i] > 0){
                result.append(i);
                System.out.print(i);
                array[i]--;
            }
        }


        return result.toString();

    }
    public boolean sumOfNum(int a) {

        float sum = 0;
        int array[] = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = 0;
        }

        while (((a % 10) > 0) || (a > 0)) {
            array[a % 10]++;
            a = a / 10;
        }

        for (int i = 9; i >= 0; i--) {
            while (array[i] > 0) {
                if ((i % 2) == 0)
                    sum = sum + i;
                array[i]--;
            }
        }

        if (sum > 15) {
            System.out.println(" Sum of even numbers is " + sum);
            return true;
        } else {
            System.out.println(" Sum of even numbers is " + sum);
            return false;


        }
    }

}
