public class ArrayWith0And1{
    public static void main(String[] args) {
        int []arr={1,0,2,0,2,1,0,2,1};
        int n=arr.length;
        int count0=0;
        int count1=0;
        int count2=0;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) count0++;
            else if(arr[i]==1) count1++;
            else count2++;
        }
        for(int i=0;i<count0;i++) arr[index++]=0;
        for(int k=0;k<count2;k++) arr[index++]=1;
        for(int j=0;j<count2;j++) arr[index++]=2;
        for(int l=0;l<n;l++){
          System.out.print(arr[l]+" ");
        }
    }
}