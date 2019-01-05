package main.java; /**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
import java.sql.SQLOutput;
import java.util.*;

/**This class takes input numbers and returns the sum of numbers
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */

public class AddingNumbers {

    public static void main(String[] args) {


        Scanner num = new Scanner(System.in);
        int y = num.nextInt();
        int[] nums = new int[y];
        Scanner scanner = new Scanner(System.in);
        /*Takes the number and if user wants to end he can enter zero*/
        for (int i=0; i<y;)
        {

            nums[i] = scanner.nextInt();
            if(nums[i]==0)
                break;
            else
                i++;
        }

        System.out.println("sum of numbers is "+ SumOfNumbers(nums));


    }
        public static int SumOfNumbers(int[] b){

            int number, sum = 0;

        /*Adds all the numbers to get the sum*/
            for( int num : b) {
                sum = sum + num;
            }
        return sum;
    }
}
