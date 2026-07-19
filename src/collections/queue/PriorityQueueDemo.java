package collections.queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        // ---------------- CREATION ----------------
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // ---------------- ADD METHODS ----------------
        pq.add(50);
        pq.add(10);
        pq.add(90);
        pq.offer(30);
        pq.offer(70);

        System.out.println("Priority Queue : " + pq);

        // ---------------- ACCESS METHODS ----------------
        System.out.println("\n----- Access Methods -----");

        System.out.println("peek()    : " + pq.peek());
        System.out.println("element() : " + pq.element());

        // ---------------- SEARCH METHODS ----------------
        System.out.println("\n----- Search Methods -----");

        System.out.println("contains(30) : " + pq.contains(30));
        System.out.println("contains(100): " + pq.contains(100));

        // ---------------- REMOVE METHODS ----------------
        System.out.println("\n----- Remove Methods -----");

        System.out.println("poll()   : " + pq.poll());
        System.out.println("After poll() : " + pq);

        System.out.println("remove() : " + pq.remove());
        System.out.println("After remove() : " + pq);

        pq.remove(70);
        System.out.println("After remove(Object) : " + pq);

        // ---------------- SIZE ----------------
        System.out.println("\nSize : " + pq.size());

        // ---------------- ITERATOR ----------------
        System.out.println("\n----- Iterator -----");

        Iterator<Integer> iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // ---------------- ENHANCED FOR LOOP ----------------
        System.out.println("\n\n----- Enhanced For Loop -----");

        for (Integer num : pq) {
            System.out.print(num + " ");
        }

        // ---------------- FOREACH ----------------
        System.out.println("\n\n----- forEach() -----");

        pq.forEach(num -> System.out.print(num + " "));

        // ---------------- SECOND QUEUE ----------------
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        pq2.add(100);
        pq2.add(200);
        pq2.add(300);

        System.out.println("\n\nSecond Queue : " + pq2);

        // ---------------- BULK OPERATIONS ----------------
        PriorityQueue<Integer> union = new PriorityQueue<>(pq);

        union.addAll(pq2);
        System.out.println("\nAfter addAll() : " + union);

        union.removeAll(pq2);
        System.out.println("After removeAll() : " + union);

        PriorityQueue<Integer> common = new PriorityQueue<>();
        common.add(30);

        union.retainAll(common);
        System.out.println("After retainAll() : " + union);

        System.out.println("containsAll() : " + pq.containsAll(common));

        // ---------------- TO ARRAY ----------------
        Object[] arr = pq.toArray();

        System.out.println("\n----- toArray() -----");

        for (Object obj : arr) {
            System.out.println(obj);
        }

        // ---------------- CLONE (Alternative) ----------------
        PriorityQueue<Integer> clonedQueue = new PriorityQueue<>(pq);

        System.out.println("\nCloned Queue : " + clonedQueue);

        // ---------------- SORTED REMOVAL ----------------
        System.out.println("\n----- Priority Order -----");

        while (!clonedQueue.isEmpty()) {
            System.out.print(clonedQueue.poll() + " ");
        }

        // ---------------- REVERSE ORDER ----------------
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(50);
        maxHeap.add(10);
        maxHeap.add(90);
        maxHeap.add(30);
        maxHeap.add(70);

        System.out.println("\n\nMax Heap : " + maxHeap);

        System.out.print("Removing : ");

        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }

        // ---------------- CLEAR ----------------
        pq.clear();

        System.out.println("\n\nAfter clear() : " + pq);

        // ---------------- EMPTY ----------------
        System.out.println("isEmpty() : " + pq.isEmpty());
    }
}