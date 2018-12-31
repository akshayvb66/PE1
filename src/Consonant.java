/**
*Akshay Badiger
*
*Boeing India Pvt Ltd
*
* Stackroute
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**This class takes input word and checks if each letter as vowel or consonant
 *
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */
public class Consonant {


    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the word");
        /*This takes input word from user*/
        String name = reader.readLine();
        int i;

        /*for loop for each letter of the word*/
        for(i=0;i<name.length();i++)
        {
            /*This checks if letter is vowel and prints the same*/
            if(name.charAt(i) == 'a' || name.charAt(i)== 'e' || name.charAt(i) == 'i'
                    || name.charAt(i) == 'o' || name.charAt(i) == 'u'){
                System.out.println(name.charAt(i)+"-vowel");
            }

            /*This one checks if its a consonant and prints the same*/
            else if((name.charAt(i) >= 'a'&& name.charAt(i) <= 'z'))
            {
                System.out.println(name.charAt(i)+"-Consonent");
            }
            /*If it is not a alphabet it prints out error*/
            else
            {
                System.out.println(name.charAt(i)+"Error");
            }


        }
    }
}
