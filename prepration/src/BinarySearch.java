public class BinarySearch {
    public static void binarySearch(int[] arr , int first, int last, int key) {
        System.out.println("Print the index of the key element:");

        while (first <= last) {
           int mid = (first + last) / 2;
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Key element fount at the index of:" + mid);
                break;
            } else {
                last = mid - 1;
            }

        }

            if (first > last){

               System.out.println("Number is not found");
            }
        }





    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70,80};
        int first = 0;
        int last = arr.length - 1;
        int key = 70;

        System.out.println("*** Print the original array***");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        BinarySearch search = new BinarySearch();

        search.binarySearch(arr, 0, arr.length - 1, 70);
    }
}
