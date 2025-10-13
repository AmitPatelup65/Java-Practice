
import java.util.Scanner;

public class KthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int index = 0;
        int[] arr = {6, 34, 12, 19, 25};
        for (int i = 0; i < arr.length; i++) {
            index++;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        System.out.print("Enter The number to get kth maximum Element In The Array : ");
        input = sc.nextInt();
        System.out.println("The Kth Maximum Number is : " + arr[index - input]);
        System.out.print("Enter The number to get kth Minimum Element In The Array : ");
        input = sc.nextInt();
        System.out.println("The Kth Minimum Number is : " + arr[input - 1]);

    }
}
