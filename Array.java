
import java.util.Scanner;

public class Array{
    public static void main(String[]args){
       float sum=0;
        Scanner sc=new Scanner(System.in);
        int arr []=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter The "+(i+1)+ "st Number Of Student ");
          arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
           sum=(arr[i]+sum); 
        }
         float percentage=(sum*100)/500;
         System.out.println("The Percentage Of 5 Students Are : "+percentage+"%");
   
    }
}