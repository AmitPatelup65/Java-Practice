
public class UnionOfArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 7, 4, 5};
        int[] arr2 = {5, 6, 7, 4,4, 8};
        int[] union = new int[100];
        int[] result = new int[100];
        int[] intersect = new int[100];
        int[] intersect2 = new int[100];
        int sect = 0;
        int sect1 = 0;
        int index = 0;
        int nindex = 0;
        for (int i = 0; i < arr1.length; i++) {
            union[index] = arr1[i];
            intersect[sect] = arr1[i];
            sect++;
            index++;
        }
        for (int i = 0; i < arr1.length; i++) {
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    intersect2[sect1]=arr1[i];
                    sect1++;
                    break;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            union[index] = arr2[i];
            index++;
        }
        for (int i = 0; i < index; i++) {
            boolean dup = false;
            for (int j = 1; j < index; j++) {
                if (union[i] == result[j]) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                result[nindex] = union[i];
                nindex++;
            }
        }
       
       
        System.out.print("The Union Of Array is : ");
        for (int i = 0; i < nindex; i++) {
            System.out.print(result[i] + " ");
        }
         System.out.println("");
         System.out.print("The Intersection OF Array : ");
         for (int i = 0; i < sect1; i++) {
            System.out.print(+intersect2[i] + " ");
        }

    }
}
