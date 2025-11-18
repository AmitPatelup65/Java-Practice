
import java.util.Scanner;

public class Magnitude{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Numnber");
        int n=sc.nextInt();
        if(n<0){
            n=-n;
        }
        if(n>69){
            System.out.println("Big");
        }
        else{
            System.out.println("Small");
        }
    }
}