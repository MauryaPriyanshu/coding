public class RightRotationOfArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int distance = 3;
        rightRotationArray(arr,distance);
    }

    private static void rightRotationArray(int[] arr, int distance) {
        int p = 0;
        while(p < distance){
            int temp = arr[arr.length - 1];
           // System.out.println(temp);
            for(int i = arr.length - 1; i > 0; i--){
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            p++;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }
}
