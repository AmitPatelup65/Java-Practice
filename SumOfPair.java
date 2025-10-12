public class SumOfPair{
    public static void main (String []args){
        int []arr={7,2,3,6,5};
        int summ=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length;j++){              
              summ=arr[i]+arr[j];
              if(summ>max){
                max=summ;   
              }
               }         
        }
        System.out.println(max);
        }
        
    }
