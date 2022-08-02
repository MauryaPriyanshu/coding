public class Subset {
    public static void main(String[] args){
        int[] arr1 = {2,5,8,9,4,6};
        int[] arr2 = {9,5,6};
        int length1 = arr1.length;
        int length2 = arr2.length;
        System.out.println("Check array1 is subset of array2 or not--");

        if(isSubset(arr1,arr2,length1,length2))
        {
            System.out.println("arr2[] is" + " subset of arr1");
        }
        else
        {
            System.out.println("arr2[] is" + " not subset of arr1");
        }
    }

    static boolean isSubset(int[] arr1, int[] arr2, int length1, int length2) {
        int i =0;
        int j = 0;
        for( i = 0; i < length2; i++){
            for(j = 0; j < length1; j++) {
                if (arr2[i] == arr1[j]) {
                    break;
                }
            }
            if(j == length1)
                return false;
        }
        return true;
    }
}
