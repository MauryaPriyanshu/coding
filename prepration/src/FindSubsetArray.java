public class FindSubsetArray {
    public static void main(String[] args){
        int[] arr1 = {2,4,7,9,8,5};
        int[] arr2 = {2,4,7};
        if(isSubset(arr1,arr2)){
            System.out.println("arr2 is subset of arr1");

        }
        else{
            System.out.println("arr2 is not subset of arr2");
        }
    }

    private static boolean isSubset(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        for(i = 0; i < arr2.length; i++){
            for(j = 0; j < arr1.length; j++){
                if(arr2[i] == arr1[j])
                    break;
            }
            if(j == arr1.length)
                return false;

        }
        return true;
    }
}
