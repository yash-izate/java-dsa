package collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        // ---------------- CREATION ----------------
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // ---------------- PUT METHODS ----------------
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");
        map.put(104, "David");

        // Duplicate Key (Updates Value)
        map.put(102, "Robert");

        // Null Key & Null Value
        map.put(null, "Unknown");
        map.put(105, null);

        System.out.println("LinkedHashMap : " + map);

        // ---------------- ACCESS METHODS ----------------
        System.out.println("\n----- Access Methods -----");

        System.out.println("get(103) : " + map.get(103));
        System.out.println("get(999) : " + map.get(999));

        System.out.println("getOrDefault(999, \"Not Found\") : "
                + map.getOrDefault(999, "Not Found"));

        // ---------------- SEARCH METHODS ----------------
        System.out.println("\n----- Search Methods -----");

        System.out.println("containsKey(101) : " + map.containsKey(101));
        System.out.println("containsKey(999) : " + map.containsKey(999));

        System.out.println("containsValue(\"Bob\") : "
                + map.containsValue("Bob"));

        System.out.println("containsValue(\"Robert\") : "
                + map.containsValue("Robert"));

        // ---------------- UPDATE METHODS ----------------
        map.replace(103, "Chris");
        map.replace(104, "David", "Daniel");

        System.out.println("\nAfter replace() : " + map);

        // ---------------- PUT IF ABSENT ----------------
        map.putIfAbsent(106, "Emma");
        map.putIfAbsent(101, "New Name");

        System.out.println("\nAfter putIfAbsent() : " + map);

        // ---------------- REMOVE METHODS ----------------
        map.remove(105);
        map.remove(104, "Daniel");

        System.out.println("\nAfter remove() : " + map);

        // ---------------- SIZE ----------------
        System.out.println("\nSize : " + map.size());

        // ---------------- KEY SET ----------------
        System.out.println("\n----- keySet() -----");

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // ---------------- VALUES ----------------
        System.out.println("\n----- values() -----");

        for (String value : map.values()) {
            System.out.println(value);
        }

        // ---------------- ENTRY SET ----------------
        System.out.println("\n----- entrySet() -----");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ---------------- FOR EACH ----------------
        System.out.println("\n----- forEach() -----");

        map.forEach((key, value) ->
                System.out.println(key + " : " + value));

        // ---------------- COPY ----------------
        LinkedHashMap<Integer, String> copy = new LinkedHashMap<>(map);

        System.out.println("\nCopied Map : " + copy);

        // ---------------- SECOND MAP ----------------
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();

        map2.put(201, "A");
        map2.put(202, "B");

        // ---------------- BULK OPERATIONS ----------------
        copy.putAll(map2);

        System.out.println("\nAfter putAll() : " + copy);

        copy.entrySet().removeIf(entry -> entry.getKey() > 200);

        System.out.println("After removeIf() : " + copy);

        copy.replaceAll((key, value) -> value.toUpperCase());

        System.out.println("After replaceAll() : " + copy);

        // ---------------- CLEAR ----------------
        copy.clear();

        System.out.println("\nAfter clear() : " + copy);

        // ---------------- EMPTY ----------------
        System.out.println("isEmpty() : " + copy.isEmpty());
    }
}