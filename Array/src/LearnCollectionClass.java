import java.util.*;

public class LearnCollectionClass {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(18);
        list.add(14);
        list.add(16);
        list.add(15);

        System.out.println("min element : " + Collections.min(list));
        System.out.println("max element : " + Collections.max(list));
        System.out.println("Frequency element : " + Collections.frequency(list, 12));

        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);
    }
}
