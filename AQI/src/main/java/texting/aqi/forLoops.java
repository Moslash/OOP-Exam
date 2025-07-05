
package texting.aqi;

import java.util.Random;

public class forLoops {
    public static void main(String[] args) {
        int[] pm25Levels = new int[30];
        Random rand = new Random();

        System.out.println("Tracking PM2.5 levels using FOR loop:");

        for (int day = 0; day < 30; day++) {
            pm25Levels[day] = rand.nextInt(301);
            System.out.println("Day " + (day + 1) + ": " + pm25Levels[day] + " µg/m³");
        }
    }
}
