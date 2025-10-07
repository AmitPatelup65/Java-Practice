public class SumOfArray{
    public static void main(String [] args){
        int []arr={1,-1,2,-3,5,4,-2};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
             arr[i]=(arr[i])*(-1);
              sum=sum+arr[i];
            }
            else{
              sum=sum+arr[i];  
            }
        }
       System.out.println( sum+ " ");
    }
}