public class StringReverse {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("Priyanshu");

        int n = str.length();
        for(int i = 0; i <= n/2; i++){
            int front = i;
            int back = str.length()-1-i; // 5-1-0 => 4

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back,frontChar);
        }
        System.out.println(str);
    }
}
