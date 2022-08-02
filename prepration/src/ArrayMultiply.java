public class ArrayMultiply {
    public static void main(String[] args){
        int arr[][] = {{1,2,3},{4,2,5},{6,8,4}};
        int arr1[][] = {{5,3,1},{3,8,9},{2,4,6}};
        int arr2[][] = new int[3][3];
        System.out.println("Multiplication of first array and second array is : " );

        for(int i = 0;i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                arr2[i][j] =0;
                for(int k = 0; k < 3; k++)
                {
                    arr2[i][j] = arr2[i][j] + arr[i][k] * arr1[k][j];
                }

                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
