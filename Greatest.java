
import java.util.Scanner;

public  class Greatest{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The 1st Number -> : ");
        int a=sc.nextInt();
         System.out.println("Enter The 2nd Number -> : ");
        int b=sc.nextInt();
         System.out.println("Enter The 3rd Number -> : ");
        int c=sc.nextInt();
             if(a>b){
                if(a>c){
                    System.out.println(" a is Greatest ->");
                }
                else{
                   System.out.println(" C is Greatest -> ");
                }
             }
             else if (b>c) {
                 System.out.println("B is Greatest");
             }
             else{
                System.out.println("C is Greatest");
             }
           System.out.println((a>b)?(a>c ?a:c):(b>c?b:c));
    }
}