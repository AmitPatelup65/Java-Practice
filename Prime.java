//[2, 4, 5, 7, 9] → 3 primes
public class Prime{
    public static void main(String[] args) {
        int []arr={2,4,5,7,9};
        int count=1;
        for(int i=0;i<arr.length;i++){
            if((arr[i]%1)==0 && (arr[i]%arr[i])==0){
                count++;
            }
        }     
           System.out.print(arr);
    }
}