/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package main.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**This class takes input character and checks if the entered character is alphabet or digit or special character
 *
 * @version 1.0 31-12-2018
 *
 * @author Akshay Badiger
 */
public class CharacterType {

    public static void main(String args[]) throws IOException {
        char m;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        /*Taking the inout from the user*/
        System.out.print("Enter any alphabet or digit or special character:");
        m = (char) bf.read();

        CharacterType obj=new CharacterType();
        System.out.println(obj.CapitalOrSmall(m));

    }

    public static String CapitalOrSmall(char m){


        /*checks if the character is a capital letter*/
        if (m >= 97 && m <= 123) {
            System.out.println("Its a Capital letter");
            return "capital";
        }

        /*checks if the character is a small letter*/
        else if (m >= 65 && m <= 96) {
            System.out.println("Its a small letter");
            return "small";

        }

        /*checks if the character is a digit*/
        else if (m >= 48 && m <= 57) {
            System.out.println("Its a Digit");
            return "digit";
        }


        /*checks if the character is a  special character*/
        else {
            System.out.println("Its a Special character");
            return "special";

        }
    }



    }

