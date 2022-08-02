public class Number {

   static int printWithoutLoop (int num){

       if(num >0){
           printWithoutLoop(num-1);
       }
       System.out.print(num +", ");
       return num;
   }

    public static void main(String[] args) {
        printWithoutLoop(10);
    }
}
