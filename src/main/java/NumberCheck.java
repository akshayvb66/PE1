package main.java; /**
*Akshay Badiger
*
*Boeing India Pvt Ltd
*
* Stackroute
*/
import java.util.Scanner;
/**This class takes input number and checks if it is between 20 and 30 and 
 *prints tom if its odd and jerry if its odd
 * @version 1.0 31-12-2018
 *
 *
 * @author Akshay Badiger
 */
public class NumberCheck {


    public static void main(String[] args) {
	/*Input the number*/
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number= scan.nextInt();

	
	/*checks if its between 20 and 30 and prints tom and jerry*/
        if (number>=20 && number<=30 && number%2!=0)
        {
            System.out.print("Tom");
        }
        else if(number>=20 && number<=30 && number%2==0)
        {
            System.out.print("jerry");
        }
	/*if its below 20 and above 30*/
        else
            System.out.print("Number not in tha range");
    }



}
