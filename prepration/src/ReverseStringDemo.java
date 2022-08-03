import java.util.Arrays;

public class ReverseStringDemo {
    public static void main(String[] args) {
        String str = "Priyanshu";
        char arr[] = str.toCharArray();
        int length = arr.length;
        char temp = 0;

        System.out.println("******Print original String******");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println("*****Print the reverse array*****");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
    }
}

