import java.util.ArrayList;
import java.util.*;
import java.lang.*;

public class ArrayListDemo {
    public static void main(String[] args){
        List<String> arr = new ArrayList<>();
        arr.add("Priyanshu");
        arr.add("abha");
        arr.add("Shivangi");
        arr.add("Aadvik");
        arr.add("Aadvik");

        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        for(int i =0 ; i < arr.size(); i++)
            System.out.print(arr.get(i) +",");
        System.out.println();


    }

}
