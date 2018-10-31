public class TwoDeeMatrix {
    public static void main(String[] args) {
        twoDeeMatrix();
    }
        public static String twoDeeMatrix() {
            int rowSum = 0;
            int biggestNumber = 0 ;
            int newRowSum = 0;

            int[][] test = {{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}, {6, 7, 8, 9, 9}, {9, 9, 8, 7, 6}};


            for (int i = 0; i < test.length; i++) {
                if (newRowSum > biggestNumber) {
                    biggestNumber = newRowSum;
                }
                rowSum = i;
                newRowSum = 0;


                for (int j = 0; j < test[i].length; j++) {

                    newRowSum += test[i][j];
                }
            }

            String result = biggestNumber + " " + rowSum;
            System.out.println(result);
            return result;
        }
    }
