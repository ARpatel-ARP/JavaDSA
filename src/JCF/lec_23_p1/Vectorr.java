package JCF.lec_23_p1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
import java.util.List;

public class Vectorr {
    // PERFORMS ALL OPERATIONS AS WAS IN ARRAYLIST : (Exp - ensureCapacity(), peek(), poll(), offer(), clone() )
    public static void main(String[] args) {

        Vector<Integer> list = new Vector<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());

        list.remove(2);
        System.out.println(list);

        Vector<Integer> list2 = new Vector<>();
        list2.add(101);
        list2.add(102);

        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);

        list2.clear();
        System.out.println(list2.size());

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element : " + iterator.next());
        }

        List<Integer> list3 = new Vector<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        System.out.println(list3.get(2));
        System.out.println("Before Set : " + list3);
        list3.set(2, 40);
        System.out.println("After Set : " + list3);

        Object[] arr = list3.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        System.out.println(list3.contains(20));

        List<Integer> coll = new Vector<>();
        coll.add(10);
        coll.add(130);
        coll.add(20);
        coll.add(12);
        coll.add(110);
        Collections.sort(coll);
        System.out.println("sorted : " + coll);
        List<Integer> rev = coll.reversed();
        System.out.println(rev);

        // LinkedList have clone(), but it returns Object
        Vector<Integer> newList = (Vector<Integer>) list.clone();
        newList.add(20);
        newList.add(40);
        newList.add(50);
        newList.add(40);
        newList.add(50);
        newList.add(20);

        System.out.println("original list : " + list);
        System.out.println("Clone : " + newList);
        Vector<Integer> marks = new Vector<>();
        // Note: LinkedList has no ensureCapacity() — that's ArrayList only
        System.out.println(marks.isEmpty());
        System.out.println(newList.indexOf(20));
        System.out.println(newList);
        System.out.println(newList.lastIndexOf(20)); // 7

        // addFirst & addLast
        System.out.println(list);
        list.addFirst(10);
        list.addLast(100);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list); // check removal
        System.out.println(list);


    }
}
