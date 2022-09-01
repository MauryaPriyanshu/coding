public class SumTwo {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println("print index" );
        twoSum(arr,target);
    }

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; i < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    return new int[]{i+1,j+1};
            }
        }
        return new int[]{};
    }
}

