package collection;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
//        Set<String> mySet = new HashSet<>();
        Set<String> mySet = new LinkedHashSet<>();
        // create list of names of your friends
        mySet.add("priyanshu");
        mySet.add("priyanka");
        mySet.add("upama");
        mySet.add("Aadvik");
        mySet.add("shivangi");
        mySet.add("priyanka");


        System.out.println("size - " + mySet.size());
        System.out.println(mySet);

        mySet.remove("upama");

        System.out.println("size - " + mySet.size());
        System.out.println(mySet);
        List<String> toRemove = new ArrayList<>();
        toRemove.add("priyanshu");
        toRemove.add("priyanka");
        mySet.removeAll(toRemove);
        System.out.println("size - " + mySet.size());
        System.out.println(mySet);
//        mySet.clear();
        System.out.println("size - " + mySet.size());

//        mySet.add(123);
        System.out.println(mySet);

        //given list of string, capitalize all the letters and append grretings

//        for each
        Set<String> hashSet = new HashSet<>();
        for (String name : mySet) {
            hashSet.add("Mr " + name.toUpperCase());
        }
        System.out.println(hashSet);

//        find the given string in the list
        System.out.println(mySet.contains("shivangi"));
        System.out.println(mySet.contains("shivangi123"));
    }
}
