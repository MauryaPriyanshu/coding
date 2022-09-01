package collection;

import java.util.*;

//create mapping of months and its days
// jan - 31, feb - 28, mar - 31 ..
public class MapExample {
    public static void main(String[] args) {
//        Map<String, Integer> monthDayMapping = new HashMap<>();
        Map<String, Integer> monthDayMapping = new LinkedHashMap<>();

        monthDayMapping.put("jan", 31);
        monthDayMapping.put("feb", 28);
        monthDayMapping.put("mar", 31);
        monthDayMapping.put("apr", 30);
        monthDayMapping.put("jan", 31);

        System.out.println(monthDayMapping.size());
        System.out.println(monthDayMapping);

        monthDayMapping.remove("jan");
        System.out.println(monthDayMapping.size());
        System.out.println(monthDayMapping);

        monthDayMapping.remove("feb", 29);
        System.out.println(monthDayMapping.size());
        System.out.println(monthDayMapping);

        monthDayMapping.replace("apr", 33);
        System.out.println(monthDayMapping.size());
        System.out.println(monthDayMapping);

        monthDayMapping.replace("apr", 33, 43);
        System.out.println(monthDayMapping.size());
        System.out.println(monthDayMapping);

//        monthDayMapping.clear();
//
//        System.out.println(monthDayMapping.size());
//        System.out.println(monthDayMapping);

        //iterate elements and increment values of all the elements by 10
        Set<String> keySet = monthDayMapping.keySet();
        for(String key : keySet){
            int newval = monthDayMapping.get(key) + 10;
            monthDayMapping.put(key, newval);
        }
        System.out.println(monthDayMapping.size());
        System.out.println(monthDayMapping);
    }
}
