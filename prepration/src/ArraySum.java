public class ArraySum {
    public static void main(String[] args){


        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] arr2 = {{11,13,3},{7,6,5},{10,11,14}};

        System.out.println("Sum of first and second array is: ");
        int[][] arr3 = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++){
                arr3[i][j] = arr2[i][j]*arr1[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
