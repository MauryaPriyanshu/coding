package CompetativeProgramming;

public class WaveArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println("print the original array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println("Print the wave array : ");
        findWaveArray(arr);
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + ",");
        }
    }
    public static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void findWaveArray(int[] arr){
        for(int i = 0; i < arr.length -1; i += 2){
            swap(arr, i,i+1);
        }
    }
}
