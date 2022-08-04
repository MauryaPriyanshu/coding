public class SmallestAndSecondSmallest {

    public static void findSmallestAndSecondSmallest(int[] array){

        for(int i = 0; i < array.length-1 ; i++) {
            for (int j = 0; j < array.length - i-1; j++) {

                if (array[j] > array[j + 1]) {
                   int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("**Print the smallest and second smallest number of the array**");

            System.out.println(array[0]);
            System.out.println(array[1]);


    }
    public static void main(String[] args){
        int[] array = {9,5,8,3,6,1,4};

         System.out.println("Print the original array:");
         for(int i= 0; i < array.length; i++){
             System.out.print(array[i] + ",");
         }
         System.out.println();
        findSmallestAndSecondSmallest(array);
    }
}
