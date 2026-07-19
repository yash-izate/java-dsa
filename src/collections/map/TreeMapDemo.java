package collections.map;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        // ---------------- CREATION ----------------
        TreeMap<Integer, String> map = new TreeMap<>();

        // ---------------- PUT METHODS ----------------
        map.put(103, "Charlie");
        map.put(101, "Alice");
        map.put(104, "David");
        map.put(102, "Bob");

        // Duplicate Key (Updates Value)
        map.put(102, "Robert");

        System.out.println("TreeMap : " + map);

        // ---------------- ACCESS METHODS ----------------
        System.out.println("\n----- Access Methods -----");

        System.out.println("get(103) : " + map.get(103));
        System.out.println("getOrDefault(999, \"Not Found\") : "
                + map.getOrDefault(999, "Not Found"));

        // ---------------- SEARCH METHODS ----------------
        System.out.println("\n----- Search Methods -----");

        System.out.println("containsKey(101) : " + map.containsKey(101));
        System.out.println("containsValue(\"Robert\") : "
                + map.containsValue("Robert"));

        // ---------------- NAVIGATION METHODS ----------------
        System.out.println("\n----- Navigation Methods -----");

        System.out.println("firstKey() : " + map.firstKey());
        System.out.println("lastKey() : " + map.lastKey());

        System.out.println("higherKey(102) : " + map.higherKey(102));
        System.out.println("lowerKey(102) : " + map.lowerKey(102));

        System.out.println("ceilingKey(103) : " + map.ceilingKey(103));
        System.out.println("floorKey(103) : " + map.floorKey(103));

        // ---------------- UPDATE METHODS ----------------
        map.replace(103, "Chris");
        map.replace(104, "David", "Daniel");

        System.out.println("\nAfter replace() : " + map);

        // ---------------- PUT IF ABSENT ----------------
        map.putIfAbsent(105, "Emma");
        map.putIfAbsent(101, "New Name");

        System.out.println("\nAfter putIfAbsent() : " + map);

        // ---------------- REMOVE METHODS ----------------
        map.remove(105);
        map.remove(104, "Daniel");

        System.out.println("\nAfter remove() : " + map);

        System.out.println("pollFirstEntry() : " + map.pollFirstEntry());
        System.out.println("pollLastEntry() : " + map.pollLastEntry());

        System.out.println("After poll methods : " + map);

        // Add Again
        map.put(104, "Daniel");
        map.put(105, "Emma");

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

        map.forEach((k, v) -> System.out.println(k + " : " + v));

        // ---------------- COPY ----------------
        TreeMap<Integer, String> copy = new TreeMap<>(map);

        System.out.println("\nCopied Map : " + copy);

        // ---------------- SECOND MAP ----------------
        TreeMap<Integer, String> map2 = new TreeMap<>();

        map2.put(201, "A");
        map2.put(202, "B");

        // ---------------- BULK OPERATIONS ----------------
        copy.putAll(map2);

        System.out.println("\nAfter putAll() : " + copy);

        copy.entrySet().removeIf(entry -> entry.getKey() > 200);

        System.out.println("After removeIf() : " + copy);

        copy.replaceAll((k, v) -> v.toUpperCase());

        System.out.println("After replaceAll() : " + copy);

        // ---------------- SUB MAPS ----------------
        System.out.println("\nheadMap(103) : " + map.headMap(103));
        System.out.println("tailMap(103) : " + map.tailMap(103));
        System.out.println("subMap(102, 105) : " + map.subMap(102, 105));

        // ---------------- REVERSE ORDER ----------------
        TreeMap<Integer, String> reverse =
                new TreeMap<>(Collections.reverseOrder());

        reverse.putAll(map);

        System.out.println("\nReverse Order : " + reverse);

        // ---------------- CLEAR ----------------
        copy.clear();

        System.out.println("\nAfter clear() : " + copy);

        // ---------------- EMPTY ----------------
        System.out.println("isEmpty() : " + copy.isEmpty());
    }
}