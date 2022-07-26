// Fibonacci series 0,1,1,2,3,5,8,13..........
// Ponlidrome
public class PalindromeNumber {
    public static void main(String[] args){
        int num = 898;
        int rem, rev = 0;
        int temp = num;

        while(num>0)
        {
         rem = num%10;
         rev = rev*10+rem;
         num = num/10;
        }

         if(temp==rev)
         {
             System.out.print("Given number is palindrome");
         }
         else
         {
             System.out.print("Given number is not palidrome");
         }
    }
}

/*public class PalindromeNumber {
    int rev = 0, rem
    int
*/
