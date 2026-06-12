package JCF.lec_23_p1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class Stack_impl {
    // PERFORMS ALL OPERATIONS AS WAS IN ARRAYLIST : (Exp - poll(). addLast, addFirst )
    // have its own methods like : push(), pop(),
    public static void main(String[] args) {

        Stack<Integer> list = new Stack<>();
        list.push(100);
        System.out.println(list);
        System.out.println(list.size());

        Stack<Integer> list2 = new Stack<>();
        list2.push(10);

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

        Stack<Integer> list3 = new Stack<>();
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
        Stack<Integer> coll = new Stack<>();
        coll.push(10);
        coll.push(40);
        coll.push(30);
        coll.push(50);
        coll.push(40);
        Collections.sort(coll);
        System.out.println("sorted : " + coll);
        Stack<Integer> rev = new Stack<>();
        rev.addAll(coll);
        Collections.reverse(rev);
        System.out.println(rev);

        // LinkedList have clone(), but it returns Object
        Stack<Integer> newList = (Stack<Integer>) list.clone();
        newList.push(20);
        newList.push(40);
        newList.push(50);
        newList.push(40);
        newList.push(50);
        newList.push(20);
        System.out.println("original list : " + list);
        System.out.println("Clone : " + newList);
        newList.pop();
        System.out.println("popped" + newList);
        System.out.println(newList.search(50)); // -1 for not 1 for have
        Stack<Integer> marks = new Stack<>();
        marks.ensureCapacity(100);
        // Note: LinkedList has no ensureCapacity() — that's ArrayList only
        System.out.println(marks.isEmpty());
        System.out.println(newList.indexOf(20));
        System.out.println(newList.lastIndexOf(20)); // 7

        System.out.println(list);
        System.out.println(list.peek()); // returns head of the L.list
        System.out.println(list); // check removal

    }
}
