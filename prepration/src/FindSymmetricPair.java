public class FindSymmetricPair {
    static void isSymmetricPair(int arr[][],int row){
        for(int i = 0;i < row; i++){
            for(int j = i+1; j < row; j++){
                if(arr[i][0]==arr[j][1] && arr[i][1] == arr[j][0]){
                    System.out.print("(");
                    System.out.print(arr[i][0]);
                    System.out.print(",");
                    System.out.print(arr[i][1]);
                    System.out.print(")");
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[][] = new int[7][2];
        arr[0][0]= 11;
        arr[0][1]= 20;
        arr[1][0]= 30;
        arr[1][1]= 40;
        arr[2][0]= 5;
        arr[2][1]= 10;
        arr[3][0]= 40;
        arr[3][1]= 30;
        arr[4][0]= 10;
        arr[4][1]= 5;
        arr[5][0]= 20;
        arr[5][1]= 11;
        arr[6][0]= 4;
        arr[6][1]= 11;

        isSymmetricPair(arr,7);
    }
}
