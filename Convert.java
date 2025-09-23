
import java.util.Scanner;

public class Convert{
    public static void main(String[] args) {
    String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    Scanner sc= new Scanner (System.in);
     int num;
    System.out.println("Enter THe Number : ");
    num=sc.nextInt();
    if(num >=0 && num <=9){
        // for(int i=0;i<arr.length;i++){
            System.out.println(arr[num]);
        // }
    }
    else{
        System.out.println("Error");
    }
    }
}