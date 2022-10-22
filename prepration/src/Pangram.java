public class Pangram {
    public static void checkIfPangram(String sentence) {
//        return sentence.chars().distinct().count() == 26;
        int[] arr = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i) - 'a'] += 1;

        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                System.out.println("Sentence is not pangram!");
            }
        }
        System.out.println("Sentence is pangram!");


    }
    public static void main(String []  args){
        String sentence = "qwerttuiopaysdfghjklzxcvbnm";
        System.out.println("Print the sentence:- " + sentence);
        checkIfPangram(sentence);


    }
}
