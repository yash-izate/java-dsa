package collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {

        // ---------------- CREATION ----------------
        HashSet<Integer> hashSet = new HashSet<>();

        // ---------------- ADD METHODS ----------------
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);

        // Duplicate (Ignored)
        hashSet.add(20);

        // Null value (Only one allowed)
        hashSet.add(null);
        hashSet.add(null);

        System.out.println("After add() : " + hashSet);

        // ---------------- SEARCH METHODS ----------------
        System.out.println("\n----- Search Methods -----");

        System.out.println("contains(30) : " + hashSet.contains(30));
        System.out.println("contains(90) : " + hashSet.contains(90));

        // ---------------- SIZE ----------------
        System.out.println("\nSize : " + hashSet.size());

        // ---------------- REMOVE METHODS ----------------
        hashSet.remove(40);
        System.out.println("\nAfter remove(40) : " + hashSet);

        // ---------------- ITERATOR ----------------
        System.out.println("\n----- Iterator -----");

        Iterator<Integer> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // ---------------- ENHANCED FOR LOOP ----------------
        System.out.println("\n\n----- Enhanced For Loop -----");

        for (Integer num : hashSet) {
            System.out.print(num + " ");
        }

        // ---------------- FOREACH ----------------
        System.out.println("\n\n----- forEach() -----");

        hashSet.forEach(num -> System.out.print(num + " "));

        // ---------------- CLONE ----------------
        HashSet<Integer> clonedSet = (HashSet<Integer>) hashSet.clone();

        System.out.println("\n\nCloned Set : " + clonedSet);

        // ---------------- SECOND SET ----------------
        HashSet<Integer> set2 = new HashSet<>();

        set2.add(30);
        set2.add(50);
        set2.add(70);
        set2.add(90);

        System.out.println("\nSecond Set : " + set2);

        // ---------------- BULK OPERATIONS ----------------
        HashSet<Integer> union = new HashSet<>(hashSet);
        union.addAll(set2);

        System.out.println("\nUnion : " + union);

        HashSet<Integer> intersection = new HashSet<>(hashSet);
        intersection.retainAll(set2);

        System.out.println("Intersection : " + intersection);

        HashSet<Integer> difference = new HashSet<>(hashSet);
        difference.removeAll(set2);

        System.out.println("Difference : " + difference);

        System.out.println("containsAll() : " + hashSet.containsAll(intersection));

        // ---------------- TO ARRAY ----------------
        Object[] arr = hashSet.toArray();

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