package WeekThirteen;

import java.util.LinkedList;
import java.util.Queue;
public class queueDemo {
    public static void main(String[] args) {
        Queue<Object> queue = new LinkedList<>();

        System.out.println(queue.add(1));
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        System.out.println("Size of queue: "+queue.size());
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);


        queue.offer(5); //add or enqueue
        queue.offer(6);
        queue.offer(7);
        System.out.println(queue);
        System.out.println("Size of queue: "+queue.size());
        System.out.println(queue.element());
        queue.poll(); // peek
        System.out.println(queue.element()); //element
        queue.poll(); // okay so poll prints item and then gets rid of it?
        System.out.println(queue.element()); // what the
        System.out.println("The Size of Queue: "+queue.size());
        System.out.println(queue);
    }

}
