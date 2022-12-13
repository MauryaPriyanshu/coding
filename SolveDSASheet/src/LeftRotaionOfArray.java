//*********************LEFT ROTATION OF THE ARRAY********************************

public class LeftRotaionOfArray {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8};
        int distance = 3;
        int n = array.length;
        rotateArray(array,distance,n);


    }

    public static void rotateArray(int[] array, int distance, int n) {
        int p = 0;
        while(p < distance){
            int temp = array[0];

            for(int i = 0; i < n -1; i++) {
                array[i] = array[i + 1];
            }
            array[n-1] = temp;
            p++;
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
    }
}
