package CompetativeProgramming;

public class GCD {
    public static void main(String[] args) {
        int x = 4;
        int y = 12;
        gcd(x, y);
    }
    public static int gcd(int x, int y){
        if(y == 0){
            return x;
        }
        else{
            return gcd(y,x%y);
        }
    }
}
