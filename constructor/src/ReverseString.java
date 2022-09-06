import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        // my name is priyanshu
        // ym eman si
        System.out.println("Enter the sentence :");
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        String str[] = sen.split(" ");
        String reverse = "";
        for(int i = 0; i<str.length; i++) {
            String str1 = str[i];
            String revWord = "";
            for (int j = str1.length() - 1; j >= 0; j--) {
                revWord = revWord + str1.charAt(j);

            }
            reverse = reverse + revWord + " ";
        }
        System.out.println("Reversed String :"+reverse);


    }
}
