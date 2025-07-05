package texting.aqi;

import java.util.Arrays;
import java.util.Random;

public class AQI {
    
    public static void main(String[] args) {
        Random aqi = new Random();
        int min = 1;
        int max = 300;
        int[] airQualityIndexes = new int[30];
        int countAbove200 = 0;

        for (int i = 0; i < airQualityIndexes.length; i++) {
            airQualityIndexes[i] = aqi.nextInt(max - min + 1) + min;
            System.out.println(airQualityIndexes[i]);
            
            if (airQualityIndexes[i] > 200){
                countAbove200++;
            }
            
        }

        double median = computeMedian(airQualityIndexes);
        System.out.println("\nMedian AQI: " + median);
        System.out.println("Hazardous Days are "+ countAbove200);
    }

    public static double computeMedian(int[] values) {
        Arrays.sort(values);
        int middle = values.length / 2;

        if (values.length % 2 == 0) {
            return (values[middle - 1] + values[middle]) / 2.0;
        } else {
            return values[middle];
        }
    }
}
