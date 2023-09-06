public class search_target {
    public static void main(String[] args) {
        int[] n ={1,4,3,23,22,52,242,53,141,223,121,55,44};
        int t=55;
        int ans = lst(n, t);
        System.out.println("The Tagerget elment "+t+" is on index number:- "+ans);
    }
    static int lst(int[] arr,int t){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==t)
            {
                return i;
            }
        }
        return -1;
    }
}
