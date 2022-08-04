public class SelectionSortArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[] {5,2,4,3,1,9,11,50};

        System.out.println("*** Print the original array ***");
        System.out.print("[");

        for(int i =0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.print("]");
        System.out.println();

        System.out.println("*** Print the array after sorting ***");
        System.out.print("[");

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                int temp = 0;
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + ",");
        }
        System.out.print("]");
    }
}
