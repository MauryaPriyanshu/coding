package CompetativeProgramming;

public class CheckSortedArray {
    public static void main(String[] args){
        int arr[] = {9,2,3,4,5,6,7};
        System.out.println("Print array is sorted in asending order or not : ");
        asendingOrderSortedArray(arr);
    }

    public static void asendingOrderSortedArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] > arr[i]) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
