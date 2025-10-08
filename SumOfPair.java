public class SumOfPair{
    public static void main (String []args){
        int []arr={7,2,3,6,5};
        int max1=0;
        int max2=0;
        for(int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length;j++){              
              max1=arr[i]+arr[j];
              if(max1>max2){
                max2=max1;   
              }
               }         
        }
        System.out.println(max2);
        }
        
    }
