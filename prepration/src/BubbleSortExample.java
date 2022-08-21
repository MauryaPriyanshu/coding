public class BubbleSortExample {
    public static void main(String[] args){
        int[] arr = {90,10,5,89,2,50};
        System.out.println("*** Print the element of the original array ***");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        bubbleSort(arr);

        System.out.println("*** Print the array after the Sorting ***");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    }
}
