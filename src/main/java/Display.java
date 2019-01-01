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
public class Display {

    public static void main(String args[]) throws IOException {
        char m;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        /*Taking the inout from the user*/
        System.out.print("Enter any alphabet or digit or special character:");
        m = (char) bf.read();

        /*checks if the character is a capital letter*/
        if (m >= 97 && m <= 123) {
            System.out.println("Its a Capital letter");
        }

        /*checks if the character is a small letter*/
        else if (m >= 65 && m <= 96) {
            System.out.println("Its a small letter");
        }

        /*checks if the character is a digit*/
        else if (m >= 48 && m <= 57) {
            System.out.println("Its a Digit");
        }


        /*checks if the character is a  special character*/
        else {
            System.out.println("Its a Special character");
        }
    }



    }

