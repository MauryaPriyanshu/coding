public class RightRotation {
    public static void rotate(int arr[],int d, int n){
        int p = 0;
        while(p < d){
            int temp = arr[n-1];
            for(int i = n-1; i > 0 ; i--){
                arr[i] = arr[i-1];
                //5,6,7
            }
            arr[0] = temp;
            p++;
        }
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] +", ");
        }

    public static void main(String[] args){
        int arr[] = {5,6,7,8,9,10};
        int d = 3;
        int N = arr.length;
        rotate(arr,d,N);

    }
}
