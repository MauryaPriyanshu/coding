public class LeftRotation {
    public static void rotate(int arr[],int d){
        int p = 1;
        while(p <= d){
            int temp = arr[0];
            for(int i =0; i < arr.length-1;i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;
            p++;
        }
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {5,6,7,8,9,10};
        int d = 2;
        rotate(arr, d);
    }
}
