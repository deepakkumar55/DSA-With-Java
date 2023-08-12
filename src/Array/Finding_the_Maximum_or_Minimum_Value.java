package Array;

import java.util.Scanner;

public class Finding_the_Maximum_or_Minimum_Value {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr={
        1,23,-4567890,2,0,4,2,3,55555,3333,35352424,5656432
    };
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max Value: "+max);
        System.out.println("min Value:  "+min);

    }

}
