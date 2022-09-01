package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class GenerateFrequencyMapOfGivenString {
    public static void main(String[] args) {
        String input = "mynameisarvindandadvikismysonpriyanshuismysister";
//        Map<Character, Integer> frequnecyMap = new HashMap<>();
//        Map<Character, Integer> frequnecyMap = new LinkedHashMap<>();
        Map<Character, Integer> frequnecyMap = new TreeMap<>();
        //int - 0
        //Integer - null
        for(char c : input.toCharArray()){
            if(frequnecyMap.get(c) == null){
                frequnecyMap.put(c, 1);
            }else{
                frequnecyMap.put(c, frequnecyMap.get(c) + 1);
            }
        }

        for(char c : frequnecyMap.keySet()){
            System.out.println(c + "-----" + frequnecyMap.get(c));
        }
        System.out.println(frequnecyMap);
        System.out.println(frequnecyMap.keySet());
        System.out.println(frequnecyMap.values());
    }
}
