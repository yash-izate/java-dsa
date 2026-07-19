package collections.queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        // ---------------- CREATION ----------------
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // ---------------- ADD METHODS ----------------
        deque.add(30);
        deque.add(40);

        deque.addFirst(20);
        deque.addLast(50);

        deque.offer(60);
        deque.offerFirst(10);
        deque.offerLast(70);

        System.out.println("After Adding : " + deque);

        // ---------------- ACCESS METHODS ----------------
        System.out.println("\n----- Access Methods -----");

        System.out.println("element()      : " + deque.element());
        System.out.println("peek()         : " + deque.peek());

        System.out.println("getFirst()     : " + deque.getFirst());
        System.out.println("getLast()      : " + deque.getLast());

        System.out.println("peekFirst()    : " + deque.peekFirst());
        System.out.println("peekLast()     : " + deque.peekLast());

        // ---------------- SEARCH METHODS ----------------
        System.out.println("\n----- Search Methods -----");

        System.out.println("contains(40) : " + deque.contains(40));
        System.out.println("contains(90) : " + deque.contains(90));

        // ---------------- REMOVE METHODS ----------------
        System.out.println("\n----- Remove Methods -----");

        System.out.println("remove()      : " + deque.remove());
        System.out.println("After remove(): " + deque);

        System.out.println("removeFirst() : " + deque.removeFirst());
        System.out.println("removeLast()  : " + deque.removeLast());

        System.out.println("poll()        : " + deque.poll());
        System.out.println("pollFirst()   : " + deque.pollFirst());
        System.out.println("pollLast()    : " + deque.pollLast());

        System.out.println("After Poll Methods : " + deque);

        // ---------------- ADD AGAIN ----------------
        deque.offer(10);
        deque.offer(20);
        deque.offer(30);
        deque.offer(40);
        deque.offer(50);

        System.out.println("\nQueue : " + deque);

        // ---------------- STACK METHODS ----------------
        System.out.println("\n----- Stack Methods -----");

        deque.push(5);
        System.out.println("After push() : " + deque);

        System.out.println("pop() : " + deque.pop());

        System.out.println("After pop() : " + deque);

        // ---------------- SIZE ----------------
        System.out.println("\nSize : " + deque.size());

        // ---------------- ITERATOR ----------------
        System.out.println("\n----- Iterator -----");

        Iterator<Integer> iterator = deque.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // ---------------- DESCENDING ITERATOR ----------------
        System.out.println("\n\n----- Descending Iterator -----");

        Iterator<Integer> descending = deque.descendingIterator();

        while (descending.hasNext()) {
            System.out.print(descending.next() + " ");
        }

        // ---------------- ENHANCED FOR LOOP ----------------
        System.out.println("\n\n----- Enhanced For Loop -----");

        for (Integer num : deque) {
            System.out.print(num + " ");
        }

        // ---------------- FOREACH ----------------
        System.out.println("\n\n----- forEach() -----");

        deque.forEach(num -> System.out.print(num + " "));

        // ---------------- SECOND DEQUE ----------------
        ArrayDeque<Integer> deque2 = new ArrayDeque<>();

        deque2.offer(40);
        deque2.offer(50);
        deque2.offer(60);

        // ---------------- BULK OPERATIONS ----------------
        ArrayDeque<Integer> union = new ArrayDeque<>(deque);

        union.addAll(deque2);
        System.out.println("\n\nAfter addAll() : " + union);

        union.removeAll(deque2);
        System.out.println("After removeAll() : " + union);

        ArrayDeque<Integer> common = new ArrayDeque<>();
        common.offer(20);
        common.offer(30);

        union.retainAll(common);
        System.out.println("After retainAll() : " + union);

        System.out.println("containsAll() : " + deque.containsAll(common));

        // ---------------- TO ARRAY ----------------
        Object[] arr = deque.toArray();

        System.out.println("\n----- toArray() -----");

        for (Object obj : arr) {
            System.out.println(obj);
        }

        // ---------------- CLEAR ----------------
        deque.clear();

        System.out.println("\nAfter clear() : " + deque);

        // ---------------- EMPTY ----------------
        System.out.println("isEmpty() : " + deque.isEmpty());
    }
}