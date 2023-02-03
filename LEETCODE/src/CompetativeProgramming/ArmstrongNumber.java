package CompetativeProgramming;

import static java.lang.Math.pow;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 374;
        int temp = num;
        int rem;
        int len = order(num);
        int sum = 0;

        while (temp != 0) {
            rem = temp % 10;
            sum = sum + (int) Math.pow(rem, len);
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.println("number is an armstrong");
        } else {
            System.out.println("number is not armstrong");
        }
    }
    public static int order(int num){
        int len = 0;
        while(num != 0){
        len++;
        num = num/10;
        }
        return len;
    }
}
