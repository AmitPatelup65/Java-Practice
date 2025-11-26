
import java.util.Scanner;

public  class Triangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter The 1st Side Of Triangle");
        int a=sc.nextInt();
         System.out.println("Enter The 2nd Side Of Triangle");
        int b=sc.nextInt();
         System.out.println("Enter The 3rd Side Of Triangle");
        int c=sc.nextInt();
       if(a+b>c && b+c> a && a+c>b){
        System.out.println("It Is Triangle");
       }
       else{
         System.out.println("It Is Not ");
       }
    }
}