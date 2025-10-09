public class UnionOfArray{
    public static void main(String[] args){
        int []arr1={1,2,2,4,5};
        int []arr2={5,6,7,7,8};
        int []union=new int [100];
        int []result=new int [100];
        int index=0;
        int nindex=0;
        for(int i=0;i<arr1.length;i++){
            
                union[index]=arr1[i];
           index++;
        }
           for(int i=0;i<arr1.length;i++){
           System.out.print(union[i]+"  ");
        }
        System.out.println("");
        for(int i=0;i<arr2.length;i++){

             //  if(union[i]!=arr2[j] && union[i]!=union[j]){
                union[index]=arr2[i];
               index++;
         //   }
         
        }
        for(int i=0;i<index;i++){
            boolean dup=false;
            for (int j=1;j<index;j++){  
                if(union[i]==result[j]){
                 dup=true;
                 break;
                }
            }
            if(!dup){
            result[nindex]=union[i];
            nindex++;
        }
        } 
        
      for(int i=0;i<nindex;i++){
           System.out.print(result[i]+" ");
        }
    }
}