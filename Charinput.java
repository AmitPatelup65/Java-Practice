import java.util.Scanner;
public  class Charinput{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter The Size Of An Array");
        int a=sc.nextInt();
        char []arr=new char[a];
         System.out.println("Eneter The Array");
         for (int i=0;i<arr.length;i++){
            arr[i]=sc.next().charAt(0);
         }
         for (int i=0;i<arr.length;i++){
             System.out.print(" "+arr[i]);
         }
    }
}