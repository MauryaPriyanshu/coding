import java.util.*;

public class LearnPriorityQueue {

    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(50);
        pq.offer(20);
        pq.offer(35);
        pq.offer(48);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
