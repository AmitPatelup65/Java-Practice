public class Practice1{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int l=arr.length;
        int []res=new int [l];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i];
            System.out.print(" "+arr[l-i-1] );
        }
        System.out.println(10/3);
    }
}