import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class display {
    public static void main(String args[]) throws IOException {
        char m;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any alphabet or digit or special character:");
        m = (char) bf.read();
        if (m >= 97 && m <= 123) {
            System.out.println("Capital");
        } else if (m >= 65 && m <= 96) {
            System.out.println("Small");
        } else if (m >= 48 && m <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }
}