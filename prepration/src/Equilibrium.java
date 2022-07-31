public class Equilibrium {
    static int equilibrium(int arr[], int n){
        int leftsum = 0;
        int rightsum = 0;

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i < j) {
                    leftsum = leftsum + arr[j];
                }
                if (i > j) {
                    rightsum = rightsum + arr[j];
                }
            }
            if (leftsum == rightsum)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {-7,1,5,2,-4,3,0};
        int n = arr.length;
        System.out.println(equilibrium(arr,n));
    }
}
