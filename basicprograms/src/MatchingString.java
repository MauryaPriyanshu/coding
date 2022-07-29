public class MatchingString {
    public static void main(String[] args){
        String mystr = "Priyanshu";
        char mychar = 'a';
        String mystr1 = mystr.toLowerCase();
        MatchingString match = new MatchingString();
        boolean matchingstring = match.ismatching(mystr, mychar);
        System.out.println("there is matching string found True/false :"+ matchingstring);
    }
    boolean ismatching(String s ,char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                return true;
            }
        }
        return false;
    }
}
