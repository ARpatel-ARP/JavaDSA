package JCF.Lec_25_pt3;

import java.util.*;

public class HashmapBasics {
    static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();
//        Map<String, String> mapping = new LinkedHashMap<>(); // preserves the insertion order
//        Map<String, String> mapping = new TreeMap<>(); // maintains sorted order
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

        System.out.println(table);
        // Replace
        table.replace("In", "Indonesia");
        System.out.println(table);
        // keySet() : returns a SET of keys
        Set<String> keySet = table.keySet();
        System.out.println(keySet);
        // values() : returns COLLECTION of values
        Collection<String > valuesColl = table.values();
        System.out.println(valuesColl);
        // keySet : returns  SET of key value pairs
        Set<Map.Entry<String, String>> kvalues = table.entrySet();
        System.out.println(kvalues);

        // Iterating over maps
        for (Map.Entry<String, String > entry : table.entrySet()){
            System.out.println("Keys : " + entry.getKey() + "  |  Values : " + entry.getValue());
        }

    }
}
