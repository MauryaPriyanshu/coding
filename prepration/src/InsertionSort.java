import java.net.StandardSocketOptions;

public class InsertionSort {

    public static void printSortedArray(int arr[]) {

        System.out.println("***Print the sorted array***");

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }


    public static void main(String[] args) {
        int arr[] = {9, 4, 6, 2, 5, 1};
        System.out.println("****Print the original array****");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");

        }
        System.out.println();
        printSortedArray(arr);
    }
}

