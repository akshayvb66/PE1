import java.util.*;

public class addition {

    public static void main(String[] args)
    {
        int number,total=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers and enter zero to end: ");

        while ((number = scan.nextInt()) != 0) {
            total += number;
        }
        System.out.println("Sum of all numbers is "+total);
    }
}