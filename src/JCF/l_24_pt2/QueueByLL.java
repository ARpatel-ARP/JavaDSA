package JCF.l_24_pt2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueByLL {
     static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());;


    }
}
