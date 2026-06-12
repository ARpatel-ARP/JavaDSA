package JCF.l_24_pt2;

import java.util.HashSet;
import java.util.Set;

public class Sets_HashSet {
    static void main(String[] args) {
        Set<Integer> Hset = new HashSet<>();
        Hset.add(10);
        Hset.add(10);
        Hset.add(10);
        System.out.println(Hset); // will only show single 10

        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        Set<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(40);
        set2.add(20);
        // intersection of set 1 and set 2 will be stored in set 1 : retainAll()
        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set2);

        // does set 2 contain all elements of set 1 ??
        System.out.println(set2.containsAll(set1));

        // does set 1 contain all elements of set 2 ??
        System.out.println(set1.containsAll(set2));



    }
}
