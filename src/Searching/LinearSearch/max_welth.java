public class max_welth {
    public static void main(String[] args) {
        int[][] arr = {
                { 9, 2, 3 }, { 3, 3, 4 }, { 1, 5 }, { 7, 3 }, { 3, 5 }
        };
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int element : account) {
                sum += element;
            }
            if (sum > max) {
                    max=sum;
            }
        }
        return max;
    }
}
