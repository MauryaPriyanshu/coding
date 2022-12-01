import java.util.*;

public class LearnHashSet {
    public static void main(String[] args){
//        HashSet<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(10);
        set.add(30);
        set.add(50);
        System.out.println(set);

        set.remove(50);
        System.out.println(set);

        System.out.println(set.contains(23));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);
    }
}
