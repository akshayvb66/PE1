package main.java;
/**
*Akshay Badiger
*
*Boeing India Pvt Ltd
*
* Stackroute
*/
import java.util.Scanner;
/**This class takes input number and checks if it is between 20 and 30 and 
 *prints tom if its odd and jerry if its even
 * @version 1.0 31-12-2018
 *
 *
 * @author Akshay Badiger
 */
public class NumTomJerry {


    public static void main(String[] args) {
        /*Input the number*/
        int number,a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number = scan.nextInt();

        System.out.println(NumTomJerry(number));
    }
    public static String NumTomJerry(int a){
	/*checks if its between 20 and 30 and prints tom and jerry*/
        String p="";
        if (a>=20 && a<=30 && a%2!=0)
        {
        p= "Tom";
        }
        else if(a>=20 && a<=30 && a%2==0)
        {
            p="Jerry";
        }
	/*if its below 20 and above 30*/
        else{
        p= "error";}
     return p;
    }



}
