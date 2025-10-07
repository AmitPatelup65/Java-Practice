public  class NegativeArray{
   public static void main(String[] args) {
       int []arr={-1,2,3,-4,5,-6};
       int n=arr.length;
       for(int i=0;i<n;i++){
        for(int j=0;j<n-1;j++){
            if(arr[j+1]>0 && arr[j]<0){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
       
       }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
   }
}