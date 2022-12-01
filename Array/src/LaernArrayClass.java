import java.util.Arrays;

public class LaernArrayClass {

    public static void main(String[] args){
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        int index = Arrays.binarySearch(numbers,4);
//
//        System.out.println("The index of element 4 in the array " + 3);
//
        int[] num = {2,5,1,4,8,6,9,12,11};
        Arrays.sort(num);

        Arrays.fill(num,12);

        for(int i : num){
        System.out.print(i + " ");}
    }
}
