public class ReverseString {
    public static void main(String[] args){
        int[] arr = {2,6,9,5,7};
        int temp = 0 ;

        System.out.println("*******Print the original array:******");
        System.out.print("[");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.print("]");
        System.out.println();

        for(int i = 0; i < arr.length/2; i++)
        {
             temp = arr[i];
             arr[i] = arr[arr.length - 1 -i];
             arr[arr.length - 1 - i] = temp;
        }

        System.out.println("*******Print the Reverse array*******");
        System.out.print("[");

        for(int i =0; i < arr.length ; i++)
        {
            System.out.print(arr[i] + ",");

        }
        System.out.print("]");
    }
}

