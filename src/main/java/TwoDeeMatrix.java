public class TwoDeeMatrix {
    // Main Method to run the function
    public static void main(String[] args) {
        twoDeeMatrix();
    }
        public static String twoDeeMatrix() {

            // Rowsum is the counter / tracker for the sum of all numbers in a 'row'
            // biggestNumber is the counter / tracker for the sum of the largest number encountered in a row
            // newRowSum is the counter

            int rowSum = 0;
            int biggestNumber = 0 ;
            int newRowSum = 0;

            // test is our 2D matrix that we are basing our solutions off of currently. Should work with
            // theoretically any size matrix as long as it maintains the 2D aspect of it.
            int[][] test = {{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}, {6, 7, 8, 9, 9}, {9, 9, 8, 7, 6}};

            // Iterate through the horizontal rows aspect and then the columns aspect.
            // If the newRowSum is bigger than the previously biggest number
            // then we will make the biggestNumber = newRowSum to create our new biggest number.
            // Then rowSum sets back to i and we iterate again, while newRowSum resets to 0 so that
            // we don't add the previous total to our new row of numbers.

            for (int i = 0; i < test.length; i++) {
                if (newRowSum > biggestNumber) {
                    biggestNumber = newRowSum;
                }
                rowSum = i;
                newRowSum = 0;

                // iterate through J which is our column height so that we can say for each time we go through
                // the columns, we will add the numbers together. So 1 + 2 + 3 + 4 + 5 = 15 etc

                for (int j = 0; j < test[i].length; j++) {

                    newRowSum += test[i][j];
                }
            }

            // Sort of cheating the system, don't need to make a test this way.
            String result = biggestNumber + " " + rowSum;
            System.out.println(result);
            return result;
        }
    }
