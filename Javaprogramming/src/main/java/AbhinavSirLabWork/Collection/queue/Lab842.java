package AbhinavSirLabWork.Collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab842 {
    public static void main(String[] args) {
        Queue<String> que=new PriorityQueue<>();
        que.add("Srinivas");
        que.add("Manish");
        que.offer("Kailash");
        que.add("Naman");
        que.add("Rakesh");
        que.offer("Dande");
        que.add("Lokesh");
        System.out.println(que);
        System.out.println("size "+que.size());
        System.out.println("Peek " +que.peek());
        System.out.println("Poll "+que.poll());
        System.out.println("Size "+que.size());
        System.out.println(que);
    }
}
