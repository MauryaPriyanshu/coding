package CompetativeProgramming;

public class SmallestAndSecondSmallestElement {
    public static void main(String[] args){
        int arr[] = {5,2,6,3,8,1,9,1};

        System.out.println("Print the orignal array :");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ,");
        }
        System.out.println();
        int small = arr[0];
        int second_small = arr[0];

        for(int i = 0; i < arr.length; i++){
            small = Math.min(small,arr[i]);
        }
        System.out.println("Print the smallest element in the array is : " + small);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < second_small && arr[i] != small){
                second_small = arr[i];
            }
        }
        System.out.println("Print the second smallest element in the array : " + second_small);
    }
}
