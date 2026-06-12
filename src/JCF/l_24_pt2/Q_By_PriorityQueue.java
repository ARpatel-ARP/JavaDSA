package JCF.l_24_pt2;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q_By_PriorityQueue {
    static void main(String[] args) {
        Queue<Integer> pQ = new PriorityQueue<>();
//   --> default priority for Int - less value = high prior(minHeap)
        pQ.offer(10);
        pQ.offer(50);
        pQ.offer(140);
        pQ.offer(30);
        pQ.offer(50);
        System.out.println(pQ.poll()); // lowest value will get polled

        Queue<Integer> p_que = new PriorityQueue<>((a,b)->b-a);
//   --> maxheap for int - more value = more prior it is
        p_que.offer(10);
        p_que.offer(50);
        p_que.offer(140);
        p_que.offer(30);
        p_que.offer(50);
        System.out.println(p_que.poll()); // highest value will get polled

    }
}
