import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean b=false;
        int value   =37;
        while(b==false) {
            System.out.println("Guess your number");

            int n = scan.nextInt();
            if (n == value) {
                b=true;
                System.out.println("Number guessed matches the original number");
            }
            else if (n > value) {
                System.out.println(" Number guessed is more than original number");
            }
            else if (n < value) {

                System.out.println(" Number guessed is less than original number");
            }

        }
    }
}