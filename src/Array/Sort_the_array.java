package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_the_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =new int[10];
        System.out.print("Enter the Array :- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
