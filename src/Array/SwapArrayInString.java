package Array;

import java.util.Arrays;

public class SwapArrayInString {
    public static void main(String[] args) {
        String[] arr ={'Deepak',,'Kunal','neha'};
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
