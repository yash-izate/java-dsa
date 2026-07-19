package collections.list;

import java.util.*;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // object can be made using reference of
        Collection<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();

        // add elements to first list
        l3.add(50);
        l3.add(25);
        l3.add(75);
        l3.add(105);
        l3.add(15);
        System.out.println("L3:" + l3);

        //remove element
        l3.remove(3);
        l3.removeLast();
        l3.removeFirst();
        System.out.println("L3:" + l3);

        // add elements using loop n second list
        for (int i = 0; i < 6; i++) {
            l2.add(i * 3);
            l2.add(i * 5);
        }
        System.out.println("L2: " + l2);

        // addAll of l3 and l2 to l1
        l1.addAll(l3);
        l1.addAll(l2);
        System.out.println("L1: " + l1);

        // removeAll of all
        l1.removeAll(l3);
        System.out.println("L3: " + l1);

        // list size
        System.out.println("Size of L1: " + l1.size());

        // clear list
        l3.clear();
        System.out.print("List 3: " + l3);

        // get method
        System.out.println(l2.get(1));


        // iterator
        Iterator<Integer> iterator = l1.iterator();

        while (iterator.hasNext()) {
            System.out.print("L1 elements: " + iterator.next());
        }

        // convert to array using toArray
        Object[] arr = l1.toArray();
        for (Object ele : arr) {
            System.out.println("LL: " + ele);

        }

        // is contained -> true or false
        System.out.println(l1);
        System.out.println(l1.contains(6));

        // sorting
        System.out.println(l2);
        Collections.sort(l2);
        System.out.println("Sort List : " + l2);

        // isEmpty
        System.out.println(l2.isEmpty());
        System.out.println(l2);
        System.out.println(l2.indexOf(6));

        // clone list - (Note - it will only work if reference type is Arraylist only, not list or collection  )
        l3.add(700);
        l3.add(300);
        l3.add(100);
        LinkedList<Integer> newList = (LinkedList<Integer>) l3.clone();
        System.out.println("New Cloned List: " + newList);

        // sort
        Collections.sort(newList);
        System.out.println(newList);

    }
}