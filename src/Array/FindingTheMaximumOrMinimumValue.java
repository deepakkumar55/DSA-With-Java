package Array;

import java.util.Scanner;

public class FindingTheMaximumOrMinimumValue {
    public static void main(String[] args) {
    int[] arr={
        1,23,-40,52
    };
    System.out.println(max(arr));
    System.out.println(min(arr));
}
    static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            
        }
        return max;
        
        
    }
    static int min(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            
        }
        return min;
        
    }
    
}
