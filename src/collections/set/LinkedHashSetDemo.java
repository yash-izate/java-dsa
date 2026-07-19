package collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        // ---------------- CREATION ----------------
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();

        // ---------------- ADD METHODS ----------------
        linkedSet.add(10);
        linkedSet.add(20);
        linkedSet.add(30);
        linkedSet.add(40);
        linkedSet.add(50);

        // Duplicate (Ignored)
        linkedSet.add(20);

        // One null value allowed
        linkedSet.add(null);
        linkedSet.add(null);

        System.out.println("After add() : " + linkedSet);

        // ---------------- SEARCH METHODS ----------------
        System.out.println("\n----- Search Methods -----");

        System.out.println("contains(30) : " + linkedSet.contains(30));
        System.out.println("contains(90) : " + linkedSet.contains(90));

        // ---------------- SIZE ----------------
        System.out.println("\nSize : " + linkedSet.size());

        // ---------------- REMOVE METHODS ----------------
        linkedSet.remove(40);

        System.out.println("\nAfter remove(40) : " + linkedSet);

        // ---------------- ITERATOR ----------------
        System.out.println("\n----- Iterator -----");

        Iterator<Integer> iterator = linkedSet.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // ---------------- ENHANCED FOR LOOP ----------------
        System.out.println("\n\n----- Enhanced For Loop -----");

        for (Integer num : linkedSet) {
            System.out.print(num + " ");
        }

        // ---------------- FOREACH ----------------
        System.out.println("\n\n----- forEach() -----");

        linkedSet.forEach(num -> System.out.print(num + " "));

        // ---------------- CLONE ----------------
        LinkedHashSet<Integer> clonedSet =
                (LinkedHashSet<Integer>) linkedSet.clone();

        System.out.println("\n\nCloned Set : " + clonedSet);

        // ---------------- SECOND SET ----------------
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        set2.add(30);
        set2.add(50);
        set2.add(70);
        set2.add(90);

        System.out.println("\nSecond Set : " + set2);

        // ---------------- BULK OPERATIONS ----------------
        LinkedHashSet<Integer> union = new LinkedHashSet<>(linkedSet);

        union.addAll(set2);
        System.out.println("\nAfter addAll() : " + union);

        LinkedHashSet<Integer> difference = new LinkedHashSet<>(linkedSet);

        difference.removeAll(set2);
        System.out.println("After removeAll() : " + difference);

        LinkedHashSet<Integer> intersection =
                new LinkedHashSet<>(linkedSet);

        intersection.retainAll(set2);
        System.out.println("After retainAll() : " + intersection);

        System.out.println("containsAll() : " + linkedSet.containsAll(intersection));

        // ---------------- TO ARRAY ----------------
        Object[] arr = linkedSet.toArray();

        System.out.println("\n----- toArray() -----");

        for (Object obj : arr) {
            System.out.println(obj);
        }

        // ---------------- CLEAR ----------------
        clonedSet.clear();

        System.out.println("\nAfter clear() : " + clonedSet);

        // ---------------- EMPTY ----------------
        System.out.println("isEmpty() : " + clonedSet.isEmpty());
    }
}