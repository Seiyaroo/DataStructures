package D2;

// Done in a Pramp interview. Code worked via their systems.

public class DroneFlightPlanner {
    static int calcDroneMinEnergy(int[][] route) {
        // X Y Z - Z is up and down Y is left to right X is forward backward 0x, 2y, 10z

        // Exert no energy for Y movement, and Gains 1 per kWh descension and loses 1 kWh per Ascension.

        // Output is 5

        // Didnt need starting energy and energy used (optimize later)
        int energyUsed = 0;
        int startingEnergy = route[0][2];
        int maxNumber = 0;
        // if index 2 is > starting index 2(10) then we want to do the difference?

        for (int i = 0; i < route.length; i++) {
            if (maxNumber < route[i][2]) {
                maxNumber = route[i][2];
            }
        }
        energyUsed = maxNumber - startingEnergy;
        return energyUsed;
    }

    public static void main(String[] args) {

    }
}

