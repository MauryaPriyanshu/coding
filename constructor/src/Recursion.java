public class Recursion {
    public static void printNumber(int n) {
        if (n == 11) {
            return;
        }
        System.out.println(n);
        printNumber(n + 1);
    }

        public static void main(String[] args){
            int n = 1;
            System.out.println("Print the number 1 to 10:");
            printNumber(n);
        }

}


