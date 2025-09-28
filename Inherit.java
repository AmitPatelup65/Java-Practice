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
class z extends y{
    void display2(){
       System.out.println("Class z");
       System.out.println("Class z");
    }
}
 
 public class Inherit{
    public static void main(String[] args) {
        z a=new z();
        a.display();
        a.display1();
        a.display2();
    }
}