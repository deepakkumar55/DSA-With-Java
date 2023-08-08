package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PassingInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= {1,2,5,3,1,5,6};
        System.out.println(Arrays.toString(arr));
        change(arr);//pass the array to method and then we can access it's elements
        System.out.println(Arrays.toString(arr));
    }
    public static void change(int[] arr){
        arr[0]=5;
    }
    
}
