package JCF.Lec_25_pt3;

import java.util.*;

public class ComparableIF {
    static void main(String[] args) {
//        List<Students_comp> studs = new ArrayList<>();
//        studs.add(new Students_comp(39,"santosh", 48));
//        studs.add(new Students_comp(49,"raghuveer", 36));
//        studs.add(new Students_comp(39,"Moolchand", 58));
//        studs.add(new Students_comp(59,"dharampal", 38));
//
//        System.out.println(studs);
//        Collections.sort(studs, new WeightComp() );
        // or directly here as :
//        Collections.sort(studs, new Comparator<Students_comp>() {
//            @Override
//            public int compare(Students_comp o1, Students_comp o2) {
//                return o1.weight - o2.weight;
//            }
//        });
//        System.out.println("Sorted by Weight");
//        System.out.println(studs);

        // LAMBDA EXPRESSION FOR IMPL COMPARATOR
//        System.out.println("Sorted by Weight");
//        Collections.sort(studs, ((o1, o2) -> o1.weight - o2.weight));
//        System.out.println(studs);


//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);

        Integer[] arr = {5,5,3,6,3,24,56};
        Arrays.sort(arr, new RevComp());
        for (int a: arr){
            System.out.print(a + " ");
        }
    }
}
