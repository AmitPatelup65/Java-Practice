
import java.util.Scanner;

public class Nprime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter The Number ->");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            boolean check =true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    check=false;
                    break;
                }
            }
            if(check==true){
                System.out.print(i+" ");
            }
        }
    }
}