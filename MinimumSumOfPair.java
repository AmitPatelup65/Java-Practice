public class MinimumSumOfPair{
     public static void main(String[] args) {
        int []arr={6,2,4,3,7,5};
         int min=0;
         int smin=Integer.MAX_VALUE;
         for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                min=arr[i]+arr[j];
                if(smin>min){
                    smin=min;
                }
            }
         }
         System.out.println(smin);
         System.out.print (min);
     }
}