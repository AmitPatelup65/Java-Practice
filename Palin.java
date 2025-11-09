
import java.util.Scanner;

public class Palin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter The Number");
        int n = sc.nextInt();
        int check;
        int rev = 0;
        check = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        if (rev == check) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
