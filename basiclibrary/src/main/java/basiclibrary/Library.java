/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

public class Library {
    public static int[] roll(int n) {
        int[] rolls = new int[n];
        for (int i = 0; i < n; i++) {
            rolls[i] = (int) (Math.random() * (6 + 1));
        }
        return rolls;
    }

    public static boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) return true;
            }
        }
        return false;
    }

    public static double averageCalc(int[] arr) {
        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = sum / arr.length;
        return average;
    }

    public static double averageCalcNestedArray(int[][] arr){
        double lowestAvg = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            double currAvg = averageCalc(arr[i]);
            if (currAvg < lowestAvg) {
                lowestAvg = currAvg;
            }
        }
        return lowestAvg;
    }
}
