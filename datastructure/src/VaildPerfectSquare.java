import java.util.Scanner;

public class VaildPerfectSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int num = sc.nextInt();
        int sq = (int)Math.sqrt(num);

        if(sq*sq == num){
            System.out.println(num + " is Valid perfect square number!!");
        }
        else {
            System.out.println(num + " is not valid perfect square number!!");
        }
    }
}
