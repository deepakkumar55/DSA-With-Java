package Array;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr ={1,2,5,32,112,332,45,677,8865,222,973};
        swap(arr,1,9);
        ReverseTheArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i,int k){
        int temp= arr[i];
        arr[i]=arr[k];
        arr[k] =temp ;
    }
    
    static void ReverseTheArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
