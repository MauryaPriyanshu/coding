public class PrimeNumber {
    public static void main(String[] args){
        int num = 23;
        int count = 0;
        if(num < 2)
            System.out.println("the number"+num+"is not prime number!");
        for(int i = 1; i <= num; i++){
            if(num%1 == 0)
                count += 1;
        }
        if(count > 2)
            System.out.println("The given number" + num + "is not prime number!!");
        else
            System.out.println("The given number" + num+ "is prime number!!");
    }
}
