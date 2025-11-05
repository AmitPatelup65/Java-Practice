public class TwoSum{
    public static void main(String []args){
        int []arr={2,3,4,5};
        int target=9;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j+1]==target){
                    System.out.println(arr[i]+" "+arr[j+1]);
                }
                else{
                    System.out.println("Error");
                }
            }
        }
    }
}