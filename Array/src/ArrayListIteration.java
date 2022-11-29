import java.util.*;


public class ArrayListIteration {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println("the element is" + list.get(i));
        }

        for(Integer element : list){
            System.out.println("foreach element is" + element);
        }

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println("iterator" + itr.next());
        }
    }
}
