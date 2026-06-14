package JCF.Lec_25_pt3;
import java.util.Comparator;

public class WeightComp implements Comparator<Students_comp> {
    @Override
    public int compare(Students_comp o1, Students_comp o2) {
        return o1.weight - o2.weight;

    }
}
