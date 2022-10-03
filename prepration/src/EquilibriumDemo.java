public class EquilibriumDemo {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int n = arr.length;
        EquilibriumDemo equi = new EquilibriumDemo();
        System.out.println(equi.equilibrium(arr, n));
    }

    public int equilibrium(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < n; j++) {
                if (i > j) {
                    leftSum += arr[j];
                }
                if (i < j) {
                    rightSum += arr[j];
                }
            }
            System.out.println("i =" + i + ", leftSum" + leftSum + ", rightSum" + rightSum + " ");
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }
}
