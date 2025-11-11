public class SumofDigits{
    public static void main(String[] args) {
        int x=101;
        int sum=0;
        int a=0;
       while(x>0){
        a=x%10;
        sum=sum+a;
        x=x/10;
       }
       System.out.print("The Sum Of Digit -> "+sum);
    }
}