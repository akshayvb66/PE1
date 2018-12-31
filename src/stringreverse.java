import java.util.*;
import java.util.Scanner;


public class stringreverse {

    public static void main(String[] args) {

        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");

        name = sc.nextLine();


        String str1 = name;
        String str2 = "";

        for (int i=str1.length()-1; i>=0; i--) {
            str2 += str1.charAt(i);
        }

        System.out.println(str2);

    }
}