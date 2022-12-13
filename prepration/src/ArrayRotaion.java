import java.util.*;
public class ArrayRotaion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 2;
        rotate(arr, d, n);
    }


    public static void rotate(int arr[], int d, int n) {
        int p = 1;
        while (p <= d) {
            int temp = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];

            }
            arr[n - 1] = temp;
            p++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

