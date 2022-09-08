package h_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class h_6 {
    public static void main(String[] args) {

        // Task 1
        // Declare and initialize sets of HashSet hs,
        // LinkedHashSet lhs and TreeSet ts

        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        // 2
        hs.addAll(randomList(10));
        lhs.addAll(randomList(10));
        ts.addAll(randomList(10));
        System.out.println("Task 2:\n" + hs + "\n" + lhs + "\n" + ts);
        // 3
        System.out.println("Task 3:\n"+removeKey(hs, lhs));
        // 4
        System.out.println("Task 4:\n"+addKey(lhs, ts));

        // Task 5
        // Declare and initialize TreeSet ts1 set with Integer comparator
        // (-1 at% 2 = = 0; 0 at = =; 1 at% 2! = 0). Fill ts1 with 15 random numbers and print.

        Set<Integer> ts1 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t1 == t2 ? 0 : t2 % 2 == 0 ? -1 : 1;
            }
        });
        ts1.addAll(randomList(15));
        System.out.println("Task 5:\n"+ts1);
    }

    // Task 2
    // Add 10 random integer keys to sets.

    static List<Integer> randomList(int rate) {
    List<Integer> random = new ArrayList<>();
    while (random.size() < rate) {
    random.add((int) (Math.random() * 100));
    }
    return random;
    }

    // Task 3
    // Go through the set hs and, subject to the presence of the corresponding key in the set lhs,
    // remove the key from hs

    static Set<Integer> removeKey(Set<Integer> hs, Set<Integer> lhs) {
        hs.removeAll(lhs);
        return hs;
    }

    // Task 4
    // Go through the set lhs and, provided there is no corresponding key in the set ts,
    // will add the key to ts

    static Set<Integer> addKey(Set<Integer> lhs, Set<Integer> ts) {
        lhs.addAll(ts);
        return lhs;
    }

}
