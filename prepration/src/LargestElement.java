import java.util.Scanner.*;
public class LargestElement {

    public void findLargestElement(int[] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1 ; j < arr.length; j++){
                int temp = 0;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Print the largest and second largest element : ");
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-2]);
    }
    public static void main(String[] args){
        int arr[] = {11,15,60,83,90,10,50,30};
        System.out.println("Print the original element of the array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        LargestElement largestElement = new LargestElement();
        largestElement.findLargestElement(arr);
    }
}
