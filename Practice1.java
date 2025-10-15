public class Practice1{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int l=arr.length;
        int []res=new int [l];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
          
            System.out.print(" "+res[l-i-1] );
        }
    }
}