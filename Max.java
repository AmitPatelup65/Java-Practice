public class Max{
    public static void main(String[] args) {
        int []arr={1,2,5,3,5,4,5,3,5};
        int max=Integer.MIN_VALUE;
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(max==arr[i]){
                count++;
            }
        }
        System.out.print(count+" ");
    }
}