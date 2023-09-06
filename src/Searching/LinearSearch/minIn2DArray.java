public class minIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 11 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        }; 
        System.out.println(min(arr));
    }
    

    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] element : arr) {
            for (int element2 : element) {
                if (element2 < min) {
                    min=element2;
                }
            }
        }
        return min;

    }
}
