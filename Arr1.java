public class Arr1{
    public static void main(String[] args) {
        x a=new x();
        a. arr();
    }
}
class x{
    int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
    void arr(){
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+" ");
       }
       System.out.println(" ");
        }
        
        
    }
}