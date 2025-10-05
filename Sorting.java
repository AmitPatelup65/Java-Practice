public class Sorting{
    public static void main(String[] args) {
      int []arr={2,1,5,3,4};
      int n=arr.length;
      boolean check=true;
      for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                check=false;
            }
        }
        if(check==true) break;
      }
      for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
      }
     }
    }
