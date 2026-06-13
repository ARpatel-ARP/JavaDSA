package JCF.Lec_25_pt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableIF {
    static void main(String[] args) {
        List<Students_comp> studs = new ArrayList<>();
        studs.add(new Students_comp(39,"santosh", 48));
        studs.add(new Students_comp(49,"raghuveer", 36));
        studs.add(new Students_comp(39,"Moolchand", 58));
        studs.add(new Students_comp(59,"dharampal", 38));

        System.out.println(studs);
        Collections.sort(studs);
        System.out.println(studs);



//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(10);
//        list.add(10);
//        list.add(10);
    }
}
