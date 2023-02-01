package CompetativeProgramming;

public class RevereseString {
    public static void main(String[] args){
        String str = "hello";
        char[] array = str.toCharArray();
        String rev = " ";
        for(int i = array.length -1; i >= 0; i--){
            rev = rev+array[i];
        }
        System.out.println(rev);

    }
}
