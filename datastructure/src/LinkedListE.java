import java.util.LinkedList;
import java.util.Collection;

public class LinkedListE {
    public static void main(String[] args){
        LinkedList<Integer>ll = new LinkedList<Integer>();

        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.addLast(2);
        ll.addFirst(1);
         System.out.println(ll);
//         Collection.reverse(ll);

        System.out.println(ll.size());
        for(int i = 0; i < ll.size(); i++){
            System.out.print(ll.get(i) + ",");
        }
        System.out.println();
        System.out.println(ll.get(1));
        ll.removeFirst();
        System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);

    }
}
