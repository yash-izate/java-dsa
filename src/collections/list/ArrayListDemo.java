package collections.list;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        // object can be made using reference of
        ArrayList<Integer> al = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Collection<Integer> c = new ArrayList<>();

        // ensure the capacity
        al.ensureCapacity(100);

        // add elements to first list
        al.add(10);
        al.add(30);
        al.add(50);
        al.add(70);
        al.add(90);
        System.out.println("List 1:" + al);

        //remove element
        al.remove(2);
        al.removeFirst();
        al.removeLast();
        System.out.println("List 1:" + al);

        // add elements using loop n second list
        for (int i = 0; i < 5; i++) {
            l.add(i * 3);
            l.add(i * 5);
        }
        System.out.println("List 2: " + l);

        // addAll of al and l to c
        c.addAll(al);
        c.addAll(l);
        System.out.println("List 3: " + c);

        // removeAll of all
        c.removeAll(al);
        System.out.println("List 3: " + c);

        // list size
        c.size();

        // clear list
        al.clear();
        System.out.println("List 1: ");

        // get method
        l.get(1);
        System.out.println();


        // iterator
        Iterator<Integer> iterator = c.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // convert to array using toArray
        Object[] arr = c.toArray();
        for (Object ele : arr) {
            System.out.println("Array: " + ele);

        }

        // is contained -> true or false
        System.out.println(c);
        System.out.println(c.contains(9));

        // sorting
        System.out.println(l);
        Collections.sort(l);
        System.out.println("Sort List: " + l);

        // isEmpty
        System.out.println(l.isEmpty());
        System.out.println(l);
        System.out.println(l.indexOf(12));

    }
}