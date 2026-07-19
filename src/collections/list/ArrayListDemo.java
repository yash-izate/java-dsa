package collections.list;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Object can be created using different reference types
        Collection<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        // ---------------- CAPACITY ----------------
        l3.ensureCapacity(100);

        // ---------------- ADD METHODS ----------------
        l3.add(10);
        l3.add(30);
        l3.add(50);
        l3.add(70);
        l3.add(90);

        l3.add(2, 40);                 // Add at index

        System.out.println("After Adding Elements : " + l3);

        // ---------------- ACCESS METHODS ----------------
        System.out.println("\n----- Access Methods -----");

        System.out.println("get(2)        : " + l3.get(2));
        System.out.println("First Element : " + l3.getFirst());   // Java 21+
        System.out.println("Last Element  : " + l3.getLast());    // Java 21+

        // ---------------- SEARCH METHODS ----------------
        System.out.println("\n----- Search Methods -----");

        System.out.println("contains(50)  : " + l3.contains(50));
        System.out.println("indexOf(70)   : " + l3.indexOf(70));
        System.out.println("lastIndexOf(70): " + l3.lastIndexOf(70));

        // ---------------- UPDATE ----------------
        l3.set(2, 45);

        System.out.println("\nAfter set()   : " + l3);

        // ---------------- REMOVE METHODS ----------------
        l3.remove(2);                  // Remove by index
        l3.remove(Integer.valueOf(70));// Remove by object
        l3.removeFirst();              // Java 21+
        l3.removeLast();               // Java 21+

        System.out.println("\nAfter Removing Elements : " + l3);

        // ---------------- SECOND LIST ----------------
        for (int i = 0; i < 5; i++) {
            l2.add(i * 3);
            l2.add(i * 5);
        }

        System.out.println("\nSecond List : " + l2);

        // ---------------- BULK OPERATIONS ----------------
        l1.addAll(l3);
        l1.addAll(l2);

        System.out.println("\nAfter addAll() : " + l1);

        l1.removeAll(l3);

        System.out.println("After removeAll() : " + l1);

        ArrayList<Integer> common = new ArrayList<>();
        common.add(0);
        common.add(3);

        System.out.println("containsAll() : " + l2.containsAll(common));

        l2.retainAll(common);

        System.out.println("After retainAll() : " + l2);

        // ---------------- SIZE ----------------
        System.out.println("\nSize : " + l1.size());

        // ---------------- ITERATOR ----------------
        System.out.println("\n----- Iterator -----");

        Iterator<Integer> iterator = l1.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // ---------------- ENHANCED FOR LOOP ----------------
        System.out.println("\n\n----- Enhanced For Loop -----");

        for (Integer num : l1) {
            System.out.print(num + " ");
        }

        // ---------------- FOREACH ----------------
        System.out.println("\n\n----- forEach() -----");

        l1.forEach(num -> System.out.print(num + " "));

        // ---------------- TO ARRAY ----------------
        System.out.println("\n\n----- toArray() -----");

        Object[] arr = l1.toArray();

        for (Object obj : arr) {
            System.out.println(obj);
        }

        // ---------------- SUBLIST ----------------
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(100);
        temp.add(200);
        temp.add(300);
        temp.add(400);
        temp.add(500);

        System.out.println("\nOriginal List : " + temp);
        System.out.println("SubList : " + temp.subList(1, 4));

        // ---------------- REMOVE IF ----------------
        temp.removeIf(n -> n > 300);

        System.out.println("After removeIf() : " + temp);

        // ---------------- REPLACE ALL ----------------
        temp.replaceAll(n -> n * 10);

        System.out.println("After replaceAll() : " + temp);

        // ---------------- CLONE ----------------
        ArrayList<Integer> clonedList =
                (ArrayList<Integer>) temp.clone();

        System.out.println("\nCloned List : " + clonedList);

        // ---------------- COLLECTIONS METHODS ----------------
        Collections.sort(clonedList);
        System.out.println("\nSorted      : " + clonedList);

        Collections.reverse(clonedList);
        System.out.println("Reverse     : " + clonedList);

        Collections.shuffle(clonedList);
        System.out.println("Shuffle     : " + clonedList);

        System.out.println("Maximum     : " + Collections.max(clonedList));
        System.out.println("Minimum     : " + Collections.min(clonedList));

        Collections.fill(clonedList, 999);
        System.out.println("Fill        : " + clonedList);

        // ---------------- CAPACITY METHODS ----------------
        clonedList.ensureCapacity(500);
        clonedList.trimToSize();

        // ---------------- CLEAR ----------------
        clonedList.clear();

        System.out.println("\nAfter clear() : " + clonedList);
        System.out.println("isEmpty()     : " + clonedList.isEmpty());
    }
}