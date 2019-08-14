import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private Queue<String> queue;

    public void setQueue(Queue queue) {
        queue.add("three");
        this.queue = queue;
    }

    public Queue<String> getQueue() {
        return queue;
    }

    public static void main(String[] args) {
        Queue<String> orig = new LinkedList<>();
        orig.add("one");

        Solution soln = new Solution();
        soln.setQueue(orig);

//        orig.add("two");

        System.out.println("Original queue:");
        orig.forEach(s-> System.out.println(s+" "));

        System.out.println("In class:");
        soln.getQueue().forEach(s-> System.out.println(s+" "));

        System.out.println(orig == soln.getQueue());
    }
}
