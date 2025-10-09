public class UnionOfArray{
    public static void main(String[] args){
        int []arr1={1,2,2,4,5};
        int []arr2={5,6,7,7,8};
        int []union=new int [100];
        int index=0;
        for(int i=0;i<arr1.length;i++){
            if(union[index]!=arr1[i]){
                union[index]=arr1[i];
           index++;
            }
           
        }
           for(int i=0;i<arr1.length;i++){
           System.out.print(union[i]+"  ");
        }
        System.out.println("");
        for(int i=0;i<arr2.length;i++){
         for(int j=0;j<arr1.length; j++){
               if(union[i]!=arr2[j] && union[i]!=union[j]){
                union[index]=arr2[j];
                index++;
            }
         }
        }
      for(int i=0;i<10;i++){
           System.out.print(union[i]+" ");
        }
    }
}