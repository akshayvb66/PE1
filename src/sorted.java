import java.util.Scanner;
import java.util.*;


public class sorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number to sort and find even sum");
        String s = scan.nextLine();
        int length = s.length();
        String res="";
        int arr[] = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<length;i++)
        {
            arr[(s.charAt(i)-'0')]++;
        }
        for(int i=9;i>=0;i--)
        {
            for(int j=0;j<arr[i];j++) {
                res += (char) (i + 48);
            }
        }
        System.out.println(res);
        int sum = arr[2]*2 + arr[4]*4 + arr[6]*6 + arr[8]*8;
        System.out.println("Sum of even numbers is : " +sum);
        if(sum > 15) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
