package JCF.lec_23_p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//         Arraylist -> concrete class
//        references                 implementations
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size()); // size of array
        // remove
        list.remove(2);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        //addAll

        list.addAll(list2); // add all elements of list2 in list
        System.out.println(list);
        list.removeAll(list2); // remove all elements of list2 in list
        System.out.println(list);
        // clear all values
        list2.clear();;
        System.out.println(list2.size());

        // to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("Element : " + iterator.next());
        }




//        List<Integer> list = new ArrayList<>();
//        Collection<Integer> coll = new ArrayList<>();


    }
}
