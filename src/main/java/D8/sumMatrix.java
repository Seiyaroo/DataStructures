package D8;
// Given a 2d matrix, find all even numbers and return them.


import java.util.ArrayList;
import java.util.List;

public class sumMatrix {
    public static void main(String[] args) {
        int[][] test = {{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}, {6, 7, 8, 9, 9}, {9, 9, 8, 7, 6}};
        sumMatrix(test);
    }
    public static List<Integer> sumMatrix(int[][] matrix) {
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    arr.add(matrix[i][j]);
                }
            }
        }
        for (int i:arr) {
            System.out.println(i);
        }
//        System.out.println(result);
        return arr;
    }
}

// Its not printing the final 6, and not sure why? Code is sound, but...maybe not?
// Output should be -> 2, 4, 4, 2, 6, 8, 8 , 6
// We currently get -> 2, 4, 4, 2, 6, 8
