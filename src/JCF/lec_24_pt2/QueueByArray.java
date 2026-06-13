package JCF.lec_24_pt2;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueByArray {
    static void main(String[] args) {
        Deque<Integer> qA = new ArrayDeque<>();
        qA.offerFirst(12);
        qA.offerLast(12);
        System.out.println(qA);
        qA.pollLast();
        qA.pollFirst();
        System.out.println(qA);
    }
}
