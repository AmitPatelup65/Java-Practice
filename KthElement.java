
import java.util.Scanner;

public class KthElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input;
        int []arr={4,1,5,2,3};
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1;j++){
              if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }
        }
        }
        System.out.println("Enter The number to get kth maximum Element In The Array : ");
        input=sc.nextInt();

            //  for(int i=0;i<arr.length;i++){
            //     System.out.print (" "+arr[i]);
            //  }
    }
}