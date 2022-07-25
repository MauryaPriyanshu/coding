import java.util.Scanner;

public class MethodDemo1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        findEvenOdd(num);
    }

    private static void findEvenOdd(int num) {
        if(num%2 == 0)
            System.out.println(num + "is even");
        else
            System.out.println(num+"is odd");
    }
}
