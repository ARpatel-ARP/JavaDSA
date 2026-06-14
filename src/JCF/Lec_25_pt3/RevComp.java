package JCF.Lec_25_pt3;

import java.util.Comparator;

public class RevComp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -Integer.compare(o1,o2);
    }
}
