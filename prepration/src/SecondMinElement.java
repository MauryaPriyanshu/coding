public class SecondMinElement {
    public static void main(String[] args){
        int[] arr = {3,14,50,10,28,30,60};
        System.out.println("Print the original array:");


        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        int min = arr[0];
        int min2 = arr[0];

        System.out.println("Print the first and second minimum element: ");
        for(int i = 1; i < arr.length; i++)
        {
           if(min > arr[i])
           {
               min2 = min;
               min = arr[i];

           }
           else
           {
               if(arr[i] < min2 && arr[i] != min)
               {
                   min2 = arr[i];
               }
           }
        }
        System.out.println("first minimum element: "+ min);
        System.out.println("second minimum element: "+ min2);
    }
}
