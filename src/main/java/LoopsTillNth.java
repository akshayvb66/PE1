package main.java; /**
*Akshay Badiger
*
*Boeing India Pvt Ltd
*
* Stackroute
*/
import java.io.IOException;
import java.util.Scanner;
/**This class takes input number and loops each integer that many times
 *
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */
public class LoopsTillNth {

    public static void main(String[] args) {
        int number;
        /*takes the input*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        number = scan.nextInt();

        LoopsTillNth num=new LoopsTillNth();

        num.LoopTillN(number);
    }
    public String LoopTillN(int a){

        StringBuilder res = new StringBuilder();


        /*looping begins from 1*/
        for(int i=1;i<=a;i++)
        {
	    /*loops the integers  itself*/
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
                res.append(i+" ");
            }

        }
        return res.toString();

    }

}
