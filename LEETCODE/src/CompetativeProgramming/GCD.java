package CompetativeProgramming;

public class GCD {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        System.out.println("GCD of the two number a and b are :" + gcd(x,y));
    }

    public static int gcd(int x, int y) {
//        if (y == 0)
//            return x;
//        if (y == 0)
//            return x;
//        if (x == y)
//            return x;
//        if (x > y) {
//            return gcd(x - y, y);
//
//        } else {
//            return gcd(x, y - x);
//        }
        if(y== 0)
            return x;

           return gcd(y, x%y);
    }
}
