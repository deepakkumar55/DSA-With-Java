package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // for (int element : arr) {
        //     System.out.print(element + " ");
        // }

        String[] str = new String[5];
        
        for (int j = 0; j < str.length; j++) {
            str[j] = sc.next();
        }
        System.out.print(Arrays.toString(str));
        str[1]="Vanshika Pagal hai"

    }
}
