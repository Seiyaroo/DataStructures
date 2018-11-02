package D3;

public class LongestSubArray {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 4, 5, 6, 9};
        longestSubArray(arr);
    }

    public static int longestSubArray(int arr[]) {
        int longestRunning = 1;
        int currentCounter = 1;

        if (arr == null) {
            return 0;
        }

        for (int i = 1; i < arr.length; i++) {
            // Counter starts at 1 to to account for first starting point
            if (arr[i-1] == arr[i]-1) {
                // If the value of left index, is 1 less than the right index we increment the counter
                currentCounter++;

                if (currentCounter > longestRunning) {
                    // If they = each other, we are saying that this is our longest run thus far
                    longestRunning = currentCounter;
                }
            } else {
                // If they are not = then we reset counter to 1, and go back up in the loop.
                currentCounter = 1;
            }
        }
        System.out.println(longestRunning);
        return longestRunning;
        // Output should be 3 for given problem domain
    }
}


