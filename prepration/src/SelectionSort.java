public class SelectionSort {

    public static void printSortedArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {4,9,6,1,8,5};

        System.out.println("***Print the original array***");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println();

        System.out.println("***Print the array after sorting***");

        for(int i = 0; i < arr.length -1; i++){
            int smallest = i;
            for(int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
                    int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;

        }
        printSortedArray(arr);
    }
}
