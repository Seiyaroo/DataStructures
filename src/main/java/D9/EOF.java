package D9;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        // Create our scanner
        Scanner input = new Scanner(System.in);
        // Our counter to keep track of lines
        int counter = 1;
        // Empty string to insert our stuff into
        String line = "";
        while(input.hasNext()) {
            // While the line of input has anything, we do the below. Which is essentially format it, and
            // add to our line counter, and then print it out.
            line = String.format(counter+" "+input.nextLine());
            counter++;
            System.out.println(line);
        }
    }
}
