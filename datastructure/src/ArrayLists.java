import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        // add element
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        System.out.println(List);
        // get element
        int element = List.get(2);
        System.out.println(element);
        // add element in between
        List.add(2,8);
        List.add(1,9);
        System.out.println(List);
        // remove element

        List.remove(4);
        System.out.println(List);
        // find size
        int size = List.size();
        System.out.println(size);

        //loops
        for(int i = 0; i < List.size(); i++){
            System.out.print(List.get(i));
        }
        System.out.println();

        // sorted
        Collections.sort(List);
        System.out.println(List);

    }
}
