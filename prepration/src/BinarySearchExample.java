public class BinarySearchExample{
    public static void main(String[] args){
        int[] arr = {50,60,70,80,90};
        int last = arr.length-1;
        int key = 50;
        binarySearch(arr,0,last,key);
    }

    public static void binarySearch(int[] arr, int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element found at the index of :" + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }

        if (first > last) {
            System.out.println("Element is not found!!");
        }
    }
}