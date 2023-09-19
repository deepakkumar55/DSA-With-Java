public class max_number {
    public static void main(String[] args) {
        int[] arr ={4,3,23,22,52,242,53,141,223,121,55,44};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}  