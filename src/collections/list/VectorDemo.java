package collections.list;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        // ---------------- CREATION ----------------
        Vector<Integer> vector = new Vector<>();

        // ---------------- CAPACITY ----------------
        System.out.println("Initial Capacity : " + vector.capacity());

        vector.ensureCapacity(20);

        // ---------------- ADD METHODS ----------------
        vector.add(10);
        vector.add(30);
        vector.add(50);
        vector.add(70);
        vector.add(90);

        vector.add(2, 40);

        vector.addElement(100);          // Legacy Method
        vector.insertElementAt(5, 0);    // Legacy Method

        System.out.println("\nAfter Adding : " + vector);

        // ---------------- ACCESS METHODS ----------------
        System.out.println("\n----- Access Methods -----");

        System.out.println("get(2)         : " + vector.get(2));
        System.out.println("firstElement() : " + vector.firstElement());
        System.out.println("lastElement()  : " + vector.lastElement());
        System.out.println("elementAt(3)   : " + vector.elementAt(3));

        // ---------------- SEARCH METHODS ----------------
        System.out.println("\n----- Search Methods -----");

        System.out.println("contains(50)    : " + vector.contains(50));
        System.out.println("indexOf(50)     : " + vector.indexOf(50));
        System.out.println("lastIndexOf(50) : " + vector.lastIndexOf(50));

        // ---------------- UPDATE ----------------
        vector.set(1, 20);
        vector.setElementAt(999, 0);      // Legacy Method

        System.out.println("\nAfter Update : " + vector);

        // ---------------- REMOVE METHODS ----------------
        vector.remove(2);
        vector.remove(Integer.valueOf(70));

        vector.removeElement(100);        // Legacy Method
        vector.removeElementAt(0);        // Legacy Method

        System.out.println("\nAfter Remove : " + vector);

        // ---------------- SIZE & CAPACITY ----------------
        System.out.println("\nSize     : " + vector.size());
        System.out.println("Capacity : " + vector.capacity());

        // ---------------- ITERATOR ----------------
        System.out.println("\n----- Iterator -----");

        Iterator<Integer> itr = vector.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // ---------------- LIST ITERATOR ----------------
        System.out.println("\n\n----- ListIterator -----");

        ListIterator<Integer> listIterator = vector.listIterator();

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }

        // ---------------- ENUMERATION ----------------
        System.out.println("\n\n----- Enumeration -----");

        Enumeration<Integer> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }

        // ---------------- TO ARRAY ----------------
        System.out.println("\n\n----- toArray() -----");

        Object[] arr = vector.toArray();

        for (Object obj : arr) {
            System.out.println(obj);
        }

        // ---------------- CLONE ----------------
        Vector<Integer> clonedVector = (Vector<Integer>) vector.clone();

        System.out.println("\nCloned Vector : " + clonedVector);

        // ---------------- BULK OPERATIONS ----------------
        Vector<Integer> vector2 = new Vector<>();

        vector2.add(1000);
        vector2.add(2000);
        vector2.add(3000);

        clonedVector.addAll(vector2);

        System.out.println("\nAfter addAll() : " + clonedVector);

        clonedVector.removeAll(vector2);

        System.out.println("After removeAll() : " + clonedVector);

        Vector<Integer> common = new Vector<>();
        common.add(20);

        clonedVector.retainAll(common);

        System.out.println("After retainAll() : " + clonedVector);

        // ---------------- COLLECTIONS METHODS ----------------
        Vector<Integer> nums = new Vector<>();

        nums.add(50);
        nums.add(10);
        nums.add(90);
        nums.add(30);
        nums.add(70);

        System.out.println("\nOriginal : " + nums);

        Collections.sort(nums);
        System.out.println("Sorted   : " + nums);

        Collections.reverse(nums);
        System.out.println("Reverse  : " + nums);

        Collections.shuffle(nums);
        System.out.println("Shuffle  : " + nums);

        System.out.println("Maximum  : " + Collections.max(nums));
        System.out.println("Minimum  : " + Collections.min(nums));

        Collections.fill(nums, 999);
        System.out.println("Fill     : " + nums);

        // ---------------- CAPACITY METHODS ----------------
        nums.setSize(10);     // Expands vector with null values
        System.out.println("\nAfter setSize(10) : " + nums);

        nums.trimToSize();
        System.out.println("Capacity after trimToSize() : " + nums.capacity());

        // ---------------- CLEAR ----------------
        nums.clear();

        System.out.println("\nAfter clear() : " + nums);
        System.out.println("isEmpty()     : " + nums.isEmpty());
    }
}