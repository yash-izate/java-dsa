package collections.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // ---------------- ADD METHODS ----------------
        list.add(20);
        list.add(40);
        list.add(60);

        list.addFirst(10);
        list.addLast(80);

        list.offer(100);
        list.offerFirst(5);
        list.offerLast(120);

        list.add(3, 30);

        System.out.println("After Adding Elements : " + list);

        // ---------------- ACCESS METHODS ----------------
        System.out.println("\n----- Access Methods -----");
        System.out.println("get(2)        : " + list.get(2));
        System.out.println("getFirst()    : " + list.getFirst());
        System.out.println("getLast()     : " + list.getLast());
        System.out.println("peek()        : " + list.peek());
        System.out.println("peekFirst()   : " + list.peekFirst());
        System.out.println("peekLast()    : " + list.peekLast());
        System.out.println("element()     : " + list.element());

        // ---------------- SEARCH METHODS ----------------
        System.out.println("\n----- Search Methods -----");
        System.out.println("contains(60)  : " + list.contains(60));
        System.out.println("indexOf(60)   : " + list.indexOf(60));
        System.out.println("lastIndexOf(60): " + list.lastIndexOf(60));

        // ---------------- UPDATE ----------------
        list.set(2, 25);
        System.out.println("\nAfter set()   : " + list);

        // ---------------- REMOVE METHODS ----------------
        System.out.println("\n----- Remove Methods -----");

        list.removeFirst();
        System.out.println("removeFirst() : " + list);

        list.removeLast();
        System.out.println("removeLast()  : " + list);

        list.remove(Integer.valueOf(40));
        System.out.println("remove(40)    : " + list);

        list.remove(2);
        System.out.println("remove(index) : " + list);

        // ---------------- STACK METHODS ----------------
        System.out.println("\n----- Stack Methods -----");

        list.push(99);
        System.out.println("push(99)      : " + list);

        System.out.println("pop()         : " + list.pop());
        System.out.println("After pop     : " + list);

        // ---------------- QUEUE METHODS ----------------
        System.out.println("\n----- Queue Methods -----");

        System.out.println("offer(500)");
        list.offer(500);

        System.out.println("peek()        : " + list.peek());

        System.out.println("poll()        : " + list.poll());

        System.out.println("After poll    : " + list);

        // ---------------- SIZE ----------------
        System.out.println("\nSize          : " + list.size());

        // ---------------- ITERATOR ----------------
        System.out.println("\n----- Iterator -----");

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // ---------------- LIST ITERATOR ----------------
        System.out.println("\n\n----- ListIterator (Forward) -----");

        ListIterator<Integer> li = list.listIterator();

        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }

        System.out.println("\n\n----- ListIterator (Backward) -----");

        while (li.hasPrevious()) {
            System.out.print(li.previous() + " ");
        }

        // ---------------- DESCENDING ITERATOR ----------------
        System.out.println("\n\n----- Descending Iterator -----");

        Iterator<Integer> desc = list.descendingIterator();

        while (desc.hasNext()) {
            System.out.print(desc.next() + " ");
        }

        // ---------------- CLONE ----------------
        LinkedList<Integer> cloned =
                (LinkedList<Integer>) list.clone();

        System.out.println("\n\nCloned List   : " + cloned);

        // ---------------- ADD ALL ----------------
        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(1000);
        list2.add(2000);
        list2.add(3000);

        list.addAll(list2);

        System.out.println("\nAfter addAll  : " + list);

        // ---------------- REMOVE ALL ----------------
        list.removeAll(list2);

        System.out.println("After removeAll : " + list);

        // ---------------- RETAIN ALL ----------------
        LinkedList<Integer> list3 = new LinkedList<>();

        list3.add(20);
        list3.add(80);

        list.retainAll(list3);

        System.out.println("After retainAll : " + list);

        // ---------------- CONTAINS ALL ----------------
        System.out.println("containsAll() : " + list.containsAll(list3));

        // ---------------- TO ARRAY ----------------
        Object[] arr = list.toArray();

        System.out.println("\nArray Elements");

        for (Object i : arr) {
            System.out.println(i);
        }

        // ---------------- SORT ----------------
        list.clear();

        list.add(50);
        list.add(10);
        list.add(90);
        list.add(30);
        list.add(70);

        Collections.sort(list);

        System.out.println("\nSorted List   : " + list);

        // ---------------- REVERSE ----------------
        Collections.reverse(list);

        System.out.println("Reverse List  : " + list);

        // ---------------- SHUFFLE ----------------
        Collections.shuffle(list);

        System.out.println("Shuffle List  : " + list);

        // ---------------- MAX & MIN ----------------
        System.out.println("Maximum       : " + Collections.max(list));
        System.out.println("Minimum       : " + Collections.min(list));

        // ---------------- CLEAR ----------------
        list.clear();

        System.out.println("\nAfter clear() : " + list);

        // ---------------- EMPTY ----------------
        System.out.println("isEmpty()     : " + list.isEmpty());
    }
}