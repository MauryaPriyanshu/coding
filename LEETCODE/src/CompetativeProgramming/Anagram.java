package CompetativeProgramming;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";

        if(str1.length() == str2.length()){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean result = Arrays.equals(arr1, arr2);

        if(result) {
            System.out.println(str1 + " and " + str2 + " are anagram");
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }
    }
}
