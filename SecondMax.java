public  class SecondMax{
    public static void main(String[] args) {
        int arr[]={9,13,7,1,12,-4,77,-1};
        int length=arr.length;
        int max=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        int secondmax=Integer.MIN_VALUE;
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];      
            }
            else if(arr[i]<min){
                secondmin=min;
                min=arr[i];
            }
            else if (arr[i]>min && arr[i]<secondmin) {
                secondmin=arr[i];
            }
          else  if(arr[i]<max && arr[i]>secondmax ){
                secondmax=arr[i];
            }
           
        }
        System.out.println("Maximum Value "+ max);
         System.out.println("Minimum Value "+ min);
        System.out.println("Second Maximum Value "+ secondmax);
        System.out.println("Second Minimum Value "+ secondmin);
       
    }
}