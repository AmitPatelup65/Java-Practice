public class Prime {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            boolean isPrime = true;  // assume karte hain prime hai

            if (n <= 1) {
                isPrime = false;  // 1 aur negative numbers prime nahi hote
            } else {
                for (int j = 2; j <= n / 2; j++) {
                    if (n % j == 0) { // agar kisi se divide ho gaya
                        isPrime = false;
                        break; 
                    }
                }
            }

            if (isPrime)
                count++;
        }

        System.out.println("Total prime numbers: " + count);
    }
}


