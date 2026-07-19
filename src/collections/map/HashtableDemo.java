package collections.map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

    public static void main(String[] args) {

        // ---------------- CREATION ----------------
        Hashtable<Integer, String> table = new Hashtable<>();

        // ---------------- PUT METHODS ----------------
        table.put(101, "Alice");
        table.put(102, "Bob");
        table.put(103, "Charlie");
        table.put(104, "David");

        // Duplicate Key (Updates Value)
        table.put(102, "Robert");

        System.out.println("Hashtable : " + table);

        // ---------------- ACCESS METHODS ----------------
        System.out.println("\n----- Access Methods -----");

        System.out.println("get(103) : " + table.get(103));

        System.out.println("getOrDefault(999, \"Not Found\") : "
                + table.getOrDefault(999, "Not Found"));

        // ---------------- SEARCH METHODS ----------------
        System.out.println("\n----- Search Methods -----");

        System.out.println("containsKey(101) : "
                + table.containsKey(101));

        System.out.println("containsValue(\"Robert\") : "
                + table.containsValue("Robert"));

        // Legacy Method
        System.out.println("contains(\"Robert\") : "
                + table.contains("Robert"));

        // ---------------- UPDATE METHODS ----------------
        table.replace(103, "Chris");
        table.replace(104, "David", "Daniel");

        System.out.println("\nAfter replace() : " + table);

        // ---------------- PUT IF ABSENT ----------------
        table.putIfAbsent(105, "Emma");
        table.putIfAbsent(101, "New Name");

        System.out.println("\nAfter putIfAbsent() : " + table);

        // ---------------- REMOVE METHODS ----------------
        table.remove(105);
        table.remove(104, "Daniel");

        System.out.println("\nAfter remove() : " + table);

        // ---------------- SIZE ----------------
        System.out.println("\nSize : " + table.size());

        // ---------------- KEY SET ----------------
        System.out.println("\n----- keySet() -----");

        for (Integer key : table.keySet()) {
            System.out.println(key);
        }

        // ---------------- VALUES ----------------
        System.out.println("\n----- values() -----");

        for (String value : table.values()) {
            System.out.println(value);
        }

        // ---------------- ENTRY SET ----------------
        System.out.println("\n----- entrySet() -----");

        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ---------------- FOR EACH ----------------
        System.out.println("\n----- forEach() -----");

        table.forEach((key, value) ->
                System.out.println(key + " : " + value));

        // ---------------- COPY ----------------
        Hashtable<Integer, String> copy =
                new Hashtable<>(table);

        System.out.println("\nCopied Hashtable : " + copy);

        // ---------------- SECOND TABLE ----------------
        Hashtable<Integer, String> table2 =
                new Hashtable<>();

        table2.put(201, "A");
        table2.put(202, "B");

        // ---------------- BULK OPERATIONS ----------------
        copy.putAll(table2);

        System.out.println("\nAfter putAll() : " + copy);

        copy.entrySet().removeIf(entry -> entry.getKey() > 200);

        System.out.println("After removeIf() : " + copy);

        copy.replaceAll((key, value) ->
                value.toUpperCase());

        System.out.println("After replaceAll() : " + copy);

        // ---------------- CLEAR ----------------
        copy.clear();

        System.out.println("\nAfter clear() : " + copy);

        // ---------------- EMPTY ----------------
        System.out.println("isEmpty() : " + copy.isEmpty());
    }
}