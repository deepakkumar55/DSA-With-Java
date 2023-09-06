import java.util.Arrays;

public class string_search {
    public static void main(String[] args) {
        String name="Deepak kumar";
        char t ='k';
        System.out.println (Arrays.toString(name.toCharArray())); // to print character 
        System.out.println(search(name,t));
    }
    static int search(String str,char t){
        if(str.length()==0){
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if(t==str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
