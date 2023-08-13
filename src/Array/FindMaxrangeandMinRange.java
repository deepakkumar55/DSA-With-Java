package Array;

public class FindMaxrangeandMinRange {
    public static void main(String[] args) {
        int[] arr = {
                1, 23, 40, 52, 22, 56, 732, -12, 435, -54
        };
        System.out.println(maxRange(arr, 4, 9));
        System.out.println(minRange(arr, 1, 6));
    }

   

    static int maxRange(int[] arr, int start, int end) {
        int max = arr[start];

        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    static int minRange(int[] arr, int start, int end) {
        int min = arr[start];

        for (int i = start; i < end; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;

    }
}
