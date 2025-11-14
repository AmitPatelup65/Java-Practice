public class Prime {
    public static void main(String[] args) {
        int a=2;
        boolean check=true;
        if(a==2){
             System.out.println("Prime"); 
             return;
        }
        if(a==1){
            System.out.println("Not Prime");
            return;
        }
       for(int i=2;i<=a/2;i++){
        if(a%i==0){
            check=false;
            break;
        }
       }
       if(check==true){
        System.out.println("Prime");
       }
       else{
        System.out.println("Not Prime");
       }

}
}


