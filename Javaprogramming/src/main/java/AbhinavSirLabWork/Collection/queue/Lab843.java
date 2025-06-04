package AbhinavSirLabWork.Collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab843 {
    public static void main(String[] args) {
        Queue<String> que1=new PriorityQueue<>();
        que1.add("Bibhor");
        que1.add("Kumar");
        que1.offer("Lokesh");
        que1.offer("Prateek");
        que1.add("Rajan");
        int leng=que1.size();
        for (int i=0;i<leng;i++){
            System.out.println(que1.poll());
        }
        System.out.println("\n**********");
        Queue<String> que2=new PriorityQueue<>(10,new Psort());
        que2.add("pawan");
        que2.add("kwality");
        que2.offer("Air bnb");
        que2.offer("Make my trip");
        que2.add("Rakesh");
        int len2=que2.size();
        for (int i=0;i<len2;i++){
            System.out.println(que2.poll());
        }
    }
}
class Psort implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
