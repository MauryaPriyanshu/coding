//FIND THE MAXIMUM AND MINIMUM ELEMENT IN THE ARRAY

public class FindMaxandMin {
    public static void main(String[] args) {
        int[] arr = {0,8, 2, 9, 4, 6, 3, 1};

        System.out.println("Print the Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();

        int max = arr[0];
        int min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
            System.out.println("Print the maximaum element in the array: " + max);
            System.out.println("Print the minimum element in the array: " + min);

    }
}
