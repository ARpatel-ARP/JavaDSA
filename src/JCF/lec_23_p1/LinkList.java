package JCF.lec_23_p1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
    // PERFORMS ALL OPERATIONS AS WAS IN ARRAYLIST : ( Exp - ensureCapacity() and clone() of arrayList )
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());

        list.remove(2);
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<>();
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

        List<Integer> list3 = new LinkedList<>();
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

        List<Integer> coll = new LinkedList<>();
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
        LinkedList<Integer> newList = (LinkedList<Integer>) list.clone();
        newList.add(20);
        newList.add(40);
        newList.add(50);
        newList.add(40);
        newList.add(50);
        newList.add(20);

        System.out.println("original list : " + list);
        System.out.println("Clone : " + newList);

        LinkedList<Integer> marks = new LinkedList<>();
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
        System.out.println(list.peek()); // returns head of the L.list
        System.out.println(list.poll()); //  ret and remove the first element
        System.out.println(list); // check removal
        list.offer(2); // add specified element at last
        System.out.println(list);


    }
}