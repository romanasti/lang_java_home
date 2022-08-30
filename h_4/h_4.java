package h_4;

import java.util.LinkedList;
import java.util.List;


public class h_4 {
    public static void main(String[] args) {
        int rateList = 10000;
        List<Integer> savedList = initRandomLinkedList(rateList);
        System.out.println(savedList);
        // 2
        System.out.println(deleteNegativeItems((savedList)));
        // 3
        long begining = System.currentTimeMillis();
        List<Integer> newList = copyAndRemoveFromList(deleteNegativeItems(savedList));
        long end = System.currentTimeMillis();
        long result1 = end - begining;
        System.out.println(newList);
        // 4
        begining = System.currentTimeMillis();
        List<Integer> newList2 = implementForAllList(copyAndRemoveFromList(deleteNegativeItems(savedList)));
        end = System.currentTimeMillis();
        System.out.println(newList2);
        long result2 = end - begining;
        // 5. Execution time
        System.out.println("function execution time for copyAndRemoveFromList: " + result1+" msc");
        System.out.println("function execution time for implementForAllList: " + result2+" msc");
    }

    // Task 1
    // Declare and initialize a linked list of 10,000 items
    // with a random number between -1024 and 1024

    static List<Integer> initRandomLinkedList(int rateList) {
        List<Integer> listRandom = new LinkedList<>();
        while (listRandom.size() <= rateList) {
            listRandom.add((int) (Math.random() * 2048 + 1) - 1024);
        }
        return listRandom;
    }

    // Task 2 
    // Go through the list and delete all negative items

    static List<Integer> deleteNegativeItems(List<Integer> list) {
        list.removeIf(value -> value < 0);
        return list;
    }

    // Task 3
    // Copy to variables and remove the first and second items from the list,
    // add the variables, save the result to the beginning of the list.

    static List<Integer> copyAndRemoveFromList(List<Integer> list) {
        int first = list.remove(0); 
        int second = list.remove(0);
        list.add(0, first + second);
        return list;
    }
 

    // Task 4
    // Implement item N_3 for the entire list.    

    static List<Integer> implementForAllList(List<Integer> list) {
            while (list.size() > 1) {
                copyAndRemoveFromList(list);
            }
            return list;
        }
}
