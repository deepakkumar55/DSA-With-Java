package Array;
import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr ={1,2,5,32,112,332,45,677,8865,222,973};
        swap(arr,1,9);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i,int k){
        int temp= arr[i];
        arr[i]=arr[k];
        arr[k] =temp ;
    }
}