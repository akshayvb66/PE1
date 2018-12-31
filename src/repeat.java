import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = scan.nextLine();
        System.out.println("enter the number");
        int      l = scan.nextInt();
        int     length = s.length();
        System.out.print(s);
        String   last ="";
        for(int i=length-l;i<length;i++){
            last = last+s.charAt(i);
        }
        for (int j = 0; j < l; j++) {
            System.out.print(last);
        }

    }
}