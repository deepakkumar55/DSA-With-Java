public class maxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        }; 
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] element : arr) {
            for (int element2 : element) {
                if (element2 > max) {
                    max=element2;
                }
            }
        }
        return max;

    }
}
