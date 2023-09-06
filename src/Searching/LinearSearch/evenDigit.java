public class evenDigit {
    public static void main(String[] args) {
        int[] arr={12,3425,2,6,7896};
        System.out.println(findNumbers(arr));
        System.out.println(digits2(-132884));
    }
    static int findNumbers(int[] nums) {    
        int count=0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }

        return count;
    }
    static boolean even(int num) {
        int numdigit= Digit(num);
        // if (numdigit %2==0) {
        //     return true;
        // }
        // return false;
        return numdigit %2==0;
            
        
    }
    static int digits2(int num) {
        if(num<0){
            num*=-1;
        }
        return (int) (Math.log10(num) + 1);
    }
    static int Digit(int num){
        int count=0;
        while (num > 0) {
            count++;
            num=num/10;
        }
        return count;
    }
}
