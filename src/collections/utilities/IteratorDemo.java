package collections.utilities;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        // ---------------- CREATION ----------------
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List : " + list);

        // ---------------- ITERATOR ----------------
        Iterator<Integer> iterator = list.iterator();

        // ---------------- hasNext() & next() ----------------
        System.out.println("\n----- hasNext() & next() -----");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ---------------- REMOVE USING ITERATOR ----------------
        iterator = list.iterator();

        while (iterator.hasNext()) {

            Integer value = iterator.next();

            if (value == 30) {
                iterator.remove();
            }
        }

        System.out.println("\nAfter remove() : " + list);

        // ---------------- forEachRemaining() ----------------
        iterator = list.iterator();

        System.out.println("\n----- forEachRemaining() -----");

        iterator.forEachRemaining(System.out::println);

        // ---------------- ITERATE USING FOR LOOP ----------------
        iterator = list.iterator();

        System.out.println("\n----- Using Iterator in for Loop -----");

        for (; iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }

        // ---------------- ENHANCED FOR LOOP ----------------
        System.out.println("\n----- Enhanced For Loop -----");

        for (Integer num : list) {
            System.out.println(num);
        }

        // ---------------- FOREACH ----------------
        System.out.println("\n----- forEach() -----");

        list.forEach(System.out::println);

        // ---------------- SIZE ----------------
        System.out.println("\nSize : " + list.size());

        // ---------------- CONTAINS ----------------
        System.out.println("Contains 20 : " + list.contains(20));

        // ---------------- CLEAR ----------------
        list.clear();

        System.out.println("\nAfter clear() : " + list);

        // ---------------- EMPTY ----------------
        System.out.println("isEmpty() : " + list.isEmpty());
    }
}