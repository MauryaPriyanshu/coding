public class NonRepeating {
    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 30, 10, 20};
        int n = arr.length;
        int res = firstNonRepeating(arr, n);
        System.out.println("Result of the First non repeating elementres :- " + res);
    }

    static int firstNonRepeating(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j])
                    break;

            if (j == n)
               return arr[i];

        }
              return 0;

    }
}

