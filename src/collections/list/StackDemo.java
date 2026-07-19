package collections.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        // ---------------- CREATION ----------------
        Stack<Integer> stack = new Stack<>();

        // ---------------- PUSH ----------------
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("After push() : " + stack);

        // ---------------- ACCESS METHODS ----------------
        System.out.println("\n----- Access Methods -----");

        System.out.println("peek()         : " + stack.peek());
        System.out.println("get(2)         : " + stack.get(2));
        System.out.println("firstElement() : " + stack.firstElement());
        System.out.println("lastElement()  : " + stack.lastElement());
        System.out.println("elementAt(3)   : " + stack.elementAt(3));

        // ---------------- SEARCH METHODS ----------------
        System.out.println("\n----- Search Methods -----");

        System.out.println("contains(30) : " + stack.contains(30));
        System.out.println("search(30)   : " + stack.search(30));
        System.out.println("indexOf(30)  : " + stack.indexOf(30));

        // ---------------- UPDATE ----------------
        stack.set(1, 25);
        stack.setElementAt(100, 0);

        System.out.println("\nAfter Update : " + stack);

        // ---------------- POP ----------------
        System.out.println("\n----- Pop Methods -----");

        System.out.println("pop() : " + stack.pop());

        System.out.println("After pop() : " + stack);

        // ---------------- ADD METHODS ----------------
        stack.add(500);
        stack.add(2, 999);
        stack.addElement(1000);

        System.out.println("\nAfter add() : " + stack);

        // ---------------- REMOVE METHODS ----------------
        stack.remove(2);
        stack.remove(Integer.valueOf(500));
        stack.removeElement(1000);
        stack.removeElementAt(0);

        System.out.println("\nAfter remove() : " + stack);

        // ---------------- SIZE ----------------
        System.out.println("\nSize : " + stack.size());

        // ---------------- EMPTY ----------------
        System.out.println("empty() : " + stack.empty());

        // ---------------- ITERATOR ----------------
        System.out.println("\n----- Iterator -----");

        Iterator<Integer> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // ---------------- LIST ITERATOR ----------------
        System.out.println("\n\n----- ListIterator -----");

        ListIterator<Integer> listIterator = stack.listIterator();

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }

        // ---------------- CLONE ----------------
        Stack<Integer> clonedStack = (Stack<Integer>) stack.clone();

        System.out.println("\n\nCloned Stack : " + clonedStack);

        // ---------------- BULK OPERATIONS ----------------
        Stack<Integer> stack2 = new Stack<>();

        stack2.push(100);
        stack2.push(200);
        stack2.push(300);

        clonedStack.addAll(stack2);

        System.out.println("\nAfter addAll() : " + clonedStack);

        clonedStack.removeAll(stack2);

        System.out.println("After removeAll() : " + clonedStack);

        Stack<Integer> common = new Stack<>();
        common.push(25);

        clonedStack.retainAll(common);

        System.out.println("After retainAll() : " + clonedStack);

        // ---------------- TO ARRAY ----------------
        Object[] arr = stack.toArray();

        System.out.println("\n----- toArray() -----");

        for (Object obj : arr) {
            System.out.println(obj);
        }

        // ---------------- COLLECTIONS METHODS ----------------
        Stack<Integer> nums = new Stack<>();

        nums.push(50);
        nums.push(10);
        nums.push(90);
        nums.push(30);
        nums.push(70);

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

        // ---------------- CAPACITY ----------------
        nums.ensureCapacity(20);
        System.out.println("\nCapacity : " + nums.capacity());

        nums.trimToSize();
        System.out.println("Capacity after trimToSize() : " + nums.capacity());

        // ---------------- CLEAR ----------------
        nums.clear();

        System.out.println("\nAfter clear() : " + nums);
        System.out.println("empty() : " + nums.empty());
    }
}