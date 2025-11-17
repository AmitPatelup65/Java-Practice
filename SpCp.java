
import java.util.Scanner;

public class SpCp{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.println("Enter The Cost Price : ");
        int  cp=sc.nextInt();
        System.out.println("Enter The Selling Price : ");
        int  sp=sc.nextInt();  
        if(sp>cp){
            int x=sp-cp;
            System.out.println("Profit : "+(x/(double)cp)*100+"%");
        }
        else  if(sp<cp){
            System.out.println("Loss : "+(cp/(double)sp)*100+"%");
        }
          else if(sp==cp){
            System.out.println("No Profit No Loss");
        }
    }
}