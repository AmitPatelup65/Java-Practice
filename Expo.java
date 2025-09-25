public class Expo{
   public static void main(String[] args) {
       x a=new x();
        a.display(2,3);
    }
}
 class x{
     void display(int a,int b){
        int c=1;
        for(int i=1;i<=b;i++){
            c=c*a;
        }
        System.out.println(c);
    }
       
}
