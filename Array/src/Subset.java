public class Subset {
    public static void main(String[] args){
        int[] arr1 = {2,5,8,9,4,6};
        int[] arr2 = {2,5,9};
        int length1 = arr1.length;
        int length2 = arr2.length;

        if(isSubset(arr1,arr2,length1,length2))
        {
            System.out.println("arr2 is subset of arr1");
        }
        else
        {
            System.out.println("arr2 is not subset of arr1");
        }
    }

    static boolean isSubset(int[] arr1, int[] arr2, int length1, int length2) {
        for(int i = 0; i < length1; i++){
            int j = 0;
            for(j = 0; j < length2; j++)
                if(arr2 == arr1)
                    break;
            if(j == length1)
                return false;
        }
        return true;
    }
}
