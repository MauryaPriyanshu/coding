public class ArrayDemo {
    public static void main(String[] args) {
        int arr [] = {30,40,50,60};
        min(arr);



    }

    static void min(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
        if(min>arr[0]){
            min = arr[i];
        }
        System.out.println("Minimum element int the given array is:" + min);
    }
}

