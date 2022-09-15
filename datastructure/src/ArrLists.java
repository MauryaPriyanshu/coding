import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrLists {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Priyanshu");
        list.add("Shivangi");
        list.add("Priyanka");
        list.add("Sakshi");

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
