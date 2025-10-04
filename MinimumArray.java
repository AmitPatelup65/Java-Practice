
public class MinimumArray {

    public static void main(String[] args) {
        int arr[] = {3, 1, 10, 2, 5};
        int length = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum Value " + min);
        System.out.println("Maximum Value " + max);
    }
}
