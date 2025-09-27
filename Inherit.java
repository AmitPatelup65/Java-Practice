class x{
    void display(){
        System.out.println("Class X");
    }
} 
 class y extends x{
    void display1(){
        System.out.println("Class Y");
    }
}
 
 public class Inherit{
    public static void main(String[] args) {
        y a=new y();
        a.display();
        a.display1();
    }
}