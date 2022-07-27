public class Armstrong {
    static boolean isArmstrong(int n){
        int temp, digits = 0, last = 0;
        double sum = 0;
        temp = n;
        while(temp > 0){
            temp = n/10;
            digits++;
        }
        temp = n;
        while(temp > 0){
            temp = temp%10;
            sum = (Math.pow(last,digits));
            temp = temp/10;
        }
        if(n == sum)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        int num = 153;
        for(int i = 0; i <= num; i++){

        }
    }
}
