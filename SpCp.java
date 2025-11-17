
import java.util.Scanner;

public class SpCp{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.println("Enter The Cost Price : ");
        int  cp=sc.nextInt();
        System.out.println("Enter The Selling Price : ");
        int  sp=sc.nextInt();  
        if(sp>cp){
            System.out.println("Profit : "+(sp-cp));
        }
        else  if(sp<cp){
            System.out.println("Loss : "+(cp-sp));
        }
          else if(sp==cp){
            System.out.println("No Profit No Loss");
        }
    }
}