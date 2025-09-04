package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        if (arr.length > 0) {
            int sum = 0;
            for (int n : arr) {
                sum += n;
            }
            return (double) sum / arr.length;
        }
        return 0.0;
    }
    public static int max(int[] arr) {
        if (arr.length > 0) {
            int max = arr[0];
            for (int n : arr) {
                if (n > max) max = n;
            }
            return max;
        }
        return Integer.MIN_VALUE;
    }
}