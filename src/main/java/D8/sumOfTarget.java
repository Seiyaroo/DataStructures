package D8;

// given an array of integers, and an int N find if 2 integers within the array sum to your given
// int N.

public class sumOfTarget {
    public static boolean sumOfTarget (int[]arr, int N) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] + arr[j] == N) {
                    return true;
                }
            }
        }
        return false;
    }
}
