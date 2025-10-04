public class SecondMin{
    public static void main(String[] args) {
        int arr[]={1,-12,3,-4,5};
        int length=arr.length;
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for(int i=0;i<length;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }
            else if(arr[i]>min && arr[i]<smin){
                smin=arr[i];
            }
        }
        System.out.println("Minimum Value "+min);
        System.out.print("Second Minimum Value "+smin);
    }
}