public  class SecondMax{
    public static void main(String[] args) {
        int arr[]={9,13,7,1,12};
        int length=arr.length;
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
         int thirdedmax=Integer.MIN_VALUE;
        for(int i=0;i<length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];      
            }
          else  if(arr[i]<max && arr[i]>secondmax ){
               thirdedmax=secondmax;
                secondmax=arr[i];
            }
            if ( arr[i]>thirdedmax && arr[i]<secondmax ) {
                thirdedmax=arr[i];
            }
        }
        System.out.println("Maximum Value "+ max);
        System.out.println("Second Maximum Value "+ secondmax);
        System.out.println("Second Maximum Value "+ thirdedmax);
    }
}