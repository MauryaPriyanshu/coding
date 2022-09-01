import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

class HashMapDemo1{
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("str1", 10);
        map.put("str2",20);
        map.put("str3",5);
        map.put("str4",4);
        HashMap<String,Integer> sorted = new HashMap<>();
        sorted.putAll(map);
        Stream<Map.Entry<String, Integer>> sorted1 = map.entrySet().stream().sorted(Comparator.comparing(e -> e.getValue()));


        }
//        System.out.println("sorted String is:");
//        sorted1.forEach(
//                e -> System.out.println(e.getKey() + "~" + e.getValue())
//        );

    }

