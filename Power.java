public class Power{
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int power=1;
        for (int i = 0; i < b; i++) {
            power=power*a;
        }
        System.out.println("Power of a^b is -> "+ power);
    }
}