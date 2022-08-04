// Find the second max element in the array..
public class SecondMaxElement {
    public static void main(String[] args){
        int arr[] = {5,8,9,10,6,11,30,60,20,2,100,70,500};

        System.out.println("Print the original array: ");
        for(int i =0 ; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println();

        System.out.println("Print the first and second maximum element of the array: ");
        int max = arr[0];
        int max2 = arr[0];
        for(int i =1 ; i < arr.length; i++) {
            if (max < arr[i]) {
                max2 = max;
                max = arr[i];
            }
            else {
                if (arr[i] > max2 && arr[i] != max) {
                    max2 = arr[i];
                }
            }
        }
        if(max == max2)
        {
            System.out.println("there is no second laegest element");
        }
        else {

            System.out.println("first largest element:" + max);
            System.out.println("Second largest element:" + max2);
        }

    }
}
