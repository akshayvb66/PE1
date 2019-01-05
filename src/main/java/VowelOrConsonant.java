package main.java; /**
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
public class VowelOrConsonant {


    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the word");
        /*This takes input word from user*/
        String name = reader.readLine();

        VowelOrConsonant res=new VowelOrConsonant();

        res.CheckForVowel(name);
    }


    public static String CheckForVowel(String a){

        StringBuilder result = new StringBuilder();


        /*for loop for each letter of the word*/
        for(int i=0;i<a.length();i++)
        {


            /*This checks if letter is vowel and prints the same*/
            if(a.charAt(i) == 'a' || a.charAt(i)== 'e' || a.charAt(i) == 'i'
                    || a.charAt(i) == 'o' || a.charAt(i) == 'u'){
                System.out.println(a.charAt(i)+" is a vowel");
                result.append("Vowel");
            }

            /*This one checks if its a consonant and prints the same*/
            else if((a.charAt(i) >= 'a'&& a.charAt(i) <= 'z'))
            {
                System.out.println(a.charAt(i)+" is a Consonent");
                result.append("Consonent");
            }
            /*If it is not a alphabet it prints out error*/
            else
            {
                System.out.println(a.charAt(i)+"Error");
                result.append("Error");
            }



        }
        return result.toString();

    }
}
