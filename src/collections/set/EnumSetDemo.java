package collections.set;

import java.util.EnumSet;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class EnumSetDemo {

    public static void main(String[] args) {

        // ---------------- CREATION ----------------
        EnumSet<Day> days = EnumSet.noneOf(Day.class);

        // ---------------- ADD METHODS ----------------
        days.add(Day.MONDAY);
        days.add(Day.WEDNESDAY);
        days.add(Day.FRIDAY);

        System.out.println("After add() : " + days);

        // ---------------- SEARCH METHODS ----------------
        System.out.println("\n----- Search Methods -----");

        System.out.println("contains(MONDAY) : "
                + days.contains(Day.MONDAY));

        System.out.println("contains(SUNDAY) : "
                + days.contains(Day.SUNDAY));

        // ---------------- SIZE ----------------
        System.out.println("\nSize : " + days.size());

        // ---------------- REMOVE METHODS ----------------
        days.remove(Day.WEDNESDAY);

        System.out.println("\nAfter remove() : " + days);

        // ---------------- ITERATOR ----------------
        System.out.println("\n----- Iterator -----");

        for (Day day : days) {
            System.out.println(day);
        }

        // ---------------- FOREACH ----------------
        System.out.println("\n----- forEach() -----");

        days.forEach(System.out::println);

        // ---------------- COPY ----------------
        EnumSet<Day> copy = EnumSet.copyOf(days);

        System.out.println("\nCopied Set : " + copy);

        // ---------------- ALL DAYS ----------------
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);

        System.out.println("\nAll Days : " + allDays);

        // ---------------- RANGE ----------------
        EnumSet<Day> workingDays =
                EnumSet.range(Day.MONDAY, Day.FRIDAY);

        System.out.println("\nWorking Days : " + workingDays);

        // ---------------- OF ----------------
        EnumSet<Day> weekend =
                EnumSet.of(Day.SATURDAY, Day.SUNDAY);

        System.out.println("Weekend : " + weekend);

        // ---------------- COMPLEMENT ----------------
        EnumSet<Day> holidays =
                EnumSet.complementOf(workingDays);

        System.out.println("Complement : " + holidays);

        // ---------------- BULK OPERATIONS ----------------
        copy.addAll(weekend);

        System.out.println("\nAfter addAll() : " + copy);

        copy.removeAll(weekend);

        System.out.println("After removeAll() : " + copy);

        copy.retainAll(workingDays);

        System.out.println("After retainAll() : " + copy);

        System.out.println("containsAll() : "
                + workingDays.containsAll(copy));

        // ---------------- TO ARRAY ----------------
        Object[] arr = workingDays.toArray();

        System.out.println("\n----- toArray() -----");

        for (Object obj : arr) {
            System.out.println(obj);
        }

        // ---------------- CLEAR ----------------
        copy.clear();

        System.out.println("\nAfter clear() : " + copy);

        // ---------------- EMPTY ----------------
        System.out.println("isEmpty() : " + copy.isEmpty());
    }
}