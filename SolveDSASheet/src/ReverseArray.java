// REVERSE THE ELEMENT IN THE GIVEN ARRAY

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 56};
        System.out.println("Print the Original array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("Print the reverse element in the array:");

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
            for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }

}
