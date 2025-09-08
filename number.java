
import java.util.Scanner;

public class number{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter THe Number");
      int x=sc.nextInt();
      int count=0;
      while(x!=0){
        x=x/10;
        count++;
      }
      System.out.println("The Number Of Digit");
    }
}