package collections.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        // ---------------- CREATION ----------------
        TreeSet<Integer> set = new TreeSet<>();

        // ---------------- ADD METHODS ----------------
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(90);
        set.add(70);

        // Duplicate (Ignored)
        set.add(30);

        System.out.println("After add() : " + set);

        // ---------------- ACCESS METHODS ----------------
        System.out.println("\n----- Access Methods -----");

        System.out.println("first() : " + set.first());
        System.out.println("last()  : " + set.last());

        System.out.println("higher(30)  : " + set.higher(30));
        System.out.println("lower(30)   : " + set.lower(30));

        System.out.println("ceiling(35) : " + set.ceiling(35));
        System.out.println("floor(35)   : " + set.floor(35));

        // ---------------- SEARCH METHODS ----------------
        System.out.println("\n----- Search Methods -----");

        System.out.println("contains(50) : " + set.contains(50));
        System.out.println("contains(100): " + set.contains(100));

        // ---------------- REMOVE METHODS ----------------
        set.remove(30);

        System.out.println("\nAfter remove(30) : " + set);

        System.out.println("pollFirst() : " + set.pollFirst());
        System.out.println("pollLast()  : " + set.pollLast());

        System.out.println("After poll methods : " + set);

        // ---------------- ADD AGAIN ----------------
        set.add(30);
        set.add(50);
        set.add(70);
        set.add(90);

        // ---------------- SIZE ----------------
        System.out.println("\nSize : " + set.size());

        // ---------------- ITERATOR ----------------
        System.out.println("\n----- Iterator -----");

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // ---------------- DESCENDING ITERATOR ----------------
        System.out.println("\n\n----- Descending Iterator -----");

        Iterator<Integer> descending = set.descendingIterator();

        while (descending.hasNext()) {
            System.out.print(descending.next() + " ");
        }

        // ---------------- ENHANCED FOR LOOP ----------------
        System.out.println("\n\n----- Enhanced For Loop -----");

        for (Integer num : set) {
            System.out.print(num + " ");
        }

        // ---------------- FOREACH ----------------
        System.out.println("\n\n----- forEach() -----");

        set.forEach(num -> System.out.print(num + " "));

        // ---------------- COPY ----------------
        TreeSet<Integer> copiedSet = new TreeSet<>(set);

        System.out.println("\n\nCopied Set : " + copiedSet);

        // ---------------- SECOND SET ----------------
        TreeSet<Integer> set2 = new TreeSet<>();

        set2.add(30);
        set2.add(70);
        set2.add(100);

        // ---------------- BULK OPERATIONS ----------------
        TreeSet<Integer> union = new TreeSet<>(set);

        union.addAll(set2);
        System.out.println("\nAfter addAll() : " + union);

        TreeSet<Integer> difference = new TreeSet<>(set);

        difference.removeAll(set2);
        System.out.println("After removeAll() : " + difference);

        TreeSet<Integer> intersection = new TreeSet<>(set);

        intersection.retainAll(set2);
        System.out.println("After retainAll() : " + intersection);

        System.out.println("containsAll() : " + set.containsAll(intersection));

        // ---------------- SUBSET METHODS ----------------
        System.out.println("\n----- NavigableSet Methods -----");

        System.out.println("headSet(50) : " + set.headSet(50));
        System.out.println("tailSet(50) : " + set.tailSet(50));
        System.out.println("subSet(30, 90) : " + set.subSet(30, 90));

        // ---------------- REVERSE ORDER ----------------
        TreeSet<Integer> reverseSet =
                new TreeSet<>(Collections.reverseOrder());

        reverseSet.addAll(set);

        System.out.println("\nReverse Order : " + reverseSet);

        // ---------------- TO ARRAY ----------------
        Object[] arr = set.toArray();

        System.out.println("\n----- toArray() -----");

        for (Object obj : arr) {
            System.out.println(obj);
        }

        // ---------------- CLEAR ----------------
        copiedSet.clear();

        System.out.println("\nAfter clear() : " + copiedSet);

        // ---------------- EMPTY ----------------
        System.out.println("isEmpty() : " + copiedSet.isEmpty());
    }
}