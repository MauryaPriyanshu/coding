import java.sql.SQLOutput;
import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int array [] = new int[n];
        int min = array[0];
        int max = array[0];
        System.out.println("Enter the element in the array:");
        for(int i =0; i < n; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(min > array[i])
            {
                min = array[i];
            }
            if(max < array[i])
            {
                max = array[i];
            }
        }


        System.out.println("Print the minimum number of the array: "+ min);
        System.out.println("Print the maximum number of the array: "+ max);

    }
}
