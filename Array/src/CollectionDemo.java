import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        //USED ADD FUNCTION TO ADD THE ELEMENT IN THE ARRAYLIST
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);
        System.out.println(list);

        list.add(1,50);
        System.out.println(list);

        List<Integer> newList = new ArrayList();
        newList.add(150);
        newList.add(160);

        list.addAll(newList);
        System.out.println(list);

        // USED GET FUNCTION TO GET THE ELEMENT OF COLLING INDEx
       list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(150));
        System.out.println(list);

//        list.clear();
//        System.out.println(list);

        list.set(2,600);
        System.out.println(list);

        System.out.println(list.contains(50));
    }
}
