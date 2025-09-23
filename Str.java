public class Str{
public static void main(String []args){
    String s1="SHEPA";
    String s2="shepa";
    if(s1.compareToIgnoreCase(s2)==0){
        System.out.println("Equal");
    }
    else{
         System.out.println(" Not Equal");
    }
}
}