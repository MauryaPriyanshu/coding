public class Lexicographically {
    static String smallestString(String s, char c){

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) > c) {
                String temp = s;
                s = s.substring(0, i);
                s += c;
                s += temp.substring(i, temp.length());
                return s;
            }
        }
            s += c;

        return s;
    }
    public static void main(String[] args){

        String str = "acd";
        System.out.println("Original String is :" + str);
        char ch = 'b';
        System.out.println("Print Lexicographically string : " + smallestString(str,ch));

    }
}
