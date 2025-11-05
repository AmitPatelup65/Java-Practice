public class TwoSum{
    public static void main(String []args){
        int []arr={2,3,4,5};
        int target=9;
        int check =1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                    check=0;
                    
                }
                
            }   
            if(check==0){
                break;
            }     
        }
    }
}