package JCF.Lec_25_pt3;

import java.util.HashMap;
import java.util.Map;

public class HashmapBasics {
    static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();
        // insertion : put and putAll
        mapping.put("In", "India");
//        mapping.put("In", "India2"); // value will get updated
        mapping.put("en", "england");
        mapping.put("us", "United states");
        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br", "Brazil");
        System.out.println("Before : " + table);
        table.putAll(mapping);
        System.out.println("After : " + table);

        // Deletion: remove
        table.remove("en");
        System.out.println(table);
        System.out.println(table.size());
        System.out.println(mapping.size());
//        table.clear();
//        mapping.clear();
//        System.out.println(table);
//        System.out.println(mapping);

        // putIfAbsent
        table.putIfAbsent("In", "India3");
        System.out.println(table); // already present so no change or insertion

        // search
        System.out.println(table.get("br")); // returns value
        System.out.println(table.getOrDefault("mex", "not there"));
        System.out.println(table.containsKey("In"));
        System.out.println(table.containsValue("Mexico"));
    }
}
