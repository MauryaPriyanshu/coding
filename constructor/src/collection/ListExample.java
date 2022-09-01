package collection;

import java.util.ArrayList;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> myList = new LinkedList<>();
        // create list of names of your friends
        myList.add("priyanshu");
        myList.add("upama");
        myList.add("Aadvik");
        myList.add("shivangi");
        myList.add("priyanka");
        myList.add("priyanka");

        myList.add(1, "arvind");

        myList.remove("upama");
        myList.remove(1);

        List<String> toRemove = new ArrayList<>();
        toRemove.add("priyanshu");
        toRemove.add("priyanka");
        myList.removeAll(toRemove);
//        myList.clear();

//        myList.add(123);
        System.out.println(myList);

        //given list of string, capitalize all the letters and append grretings

        //for each
        List<String> newList = new ArrayList<>();
        for (String name : myList) {
            newList.add("Mr " + name.toUpperCase());
        }
        System.out.println(newList);

        System.out.println(myList.get(1));
        //try-catch
        System.out.println("size - " + myList.size());
        try {

            String name = null;

            System.out.println(name.toUpperCase());
            int num = 120 / 0;
            System.out.println(myList.get(2));
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("exception occured..");
        }catch (NullPointerException exception){
            System.out.println("null pointer exception");
        }
        catch (ArithmeticException exception){
            System.out.println("ArithmeticException occured");
        }
        //find the given string in the list
        System.out.println(myList.contains("shivangi"));
        System.out.println(myList.contains("shivangi123"));
    }
}
