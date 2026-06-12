package JCF.lec_23_p1;

import java.util.*;

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
//      set and get
        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        System.out.println(list3.get(2)); // gives 30
        System.out.println("Before Set : " + list3);
        list3.set(2,40);
        System.out.println("After Set : " + list3);
//          toArray()
        Object[] arr = list3.toArray();
        for (Object obj: arr){
            System.out.println(obj);
        }
        // contains checks :
        System.out.println(list3.contains(20)); // true

        List<Integer> coll = new ArrayList<>();
        coll.add(10);
        coll.add(130);
        coll.add(20);
        coll.add(12);
        coll.add(110);
        Collections.sort(coll);
        System.out.println("sorted : " +  coll);
        List<Integer> rev = coll.reversed();
        System.out.println(rev);

        // cloning a list
        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
        System.out.println("original list : " + list);
        System.out.println("Clone : " + newList);
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(marks.isEmpty());
        System.out.println(newList.indexOf(20));

//        List<Integer> list = new ArrayList<>();
//


    }
}
