package collections.list;

import java.util.*;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // object can be made using reference of
        Collection<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        // ensure the capacity
        l3.ensureCapacity(100);

        // add elements to first list
        l3.add(10);
        l3.add(30);
        l3.add(50);
        l3.add(70);
        l3.add(90);
        System.out.println("List 1:" + l3);

        //remove element
        l3.remove(2);
        l3.removeFirst();
        l3.removeLast();
        System.out.println("List 1:" + l3);

        // add elements using loop n second list
        for (int i = 0; i < 5; i++) {
            l2.add(i * 3);
            l2.add(i * 5);
        }
        System.out.println("List 2: " + l2);

        // addAll of l3 and l2 to l1
        l1.addAll(l3);
        l1.addAll(l2);
        System.out.println("List 3: " + l1);

        // removeAll of all
        l1.removeAll(l3);
        System.out.println("List 3: " + l1);

        // list size
        l1.size();

        // clear list
        l3.clear();
        System.out.println("List 1: ");

        // get method
        System.out.println(l2.get(1));


        // iterator
        Iterator<Integer> iterator = l1.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // convert to array using toArray
        Object[] arr = l1.toArray();
        for (Object ele : arr) {
            System.out.println("Array: " + ele);

        }

        // is contained -> true or false
        System.out.println(l1);
        System.out.println(l1.contains(9));

        // sorting
        System.out.println(l2);
        Collections.sort(l2);
        System.out.println("Sort List: " + l2);

        // isEmpty
        System.out.println(l2.isEmpty());
        System.out.println(l2);
        System.out.println(l2.indexOf(12));

        // clone list - (Note - it will only work if reference type is Arraylist only, not list or collection  )
        l3.add(100);
        l3.add(200);
        l3.add(500);
        ArrayList<Integer> newList = (ArrayList<Integer>) l3.clone();
        System.out.println("New Cloned List: " + newList);

    }
}