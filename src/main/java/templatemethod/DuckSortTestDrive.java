package templatemethod;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("a", 8),
                new Duck("b", 2),
                new Duck("c", 7),
                new Duck("d", 2),
                new Duck("e", 10),
                new Duck("f", 2),
        };

        System.out.println("정렬 전: ");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\n정렬 후:");
        display(ducks);

    }

    public static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
