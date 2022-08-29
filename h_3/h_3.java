package h_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class h_3 {
    public static void main(String[] args) {
        System.out.println("First --> " + arrayLists());
        System.out.println("Second --> " + enumerationElements(arrayLists()));
        System.out.println("Third --> " + insertToList(arrayLists()));
        System.out.println("Fourth --> " + extractItem((insertToList(arrayLists()))));
        System.out.println("Fifth --> " + updateElement(arrayLists(),"blue"));
        System.out.println("Sixth --> " + removeItem(updateElement(arrayLists(),"blue")));
        System.out.println("Seventh --> " + searchElement(removeItem(updateElement(arrayLists(),"blue")), "red"));
        System.out.println("Eighth --> " + sortedList(removeItem(updateElement(arrayLists(),"blue"))));
        System.out.println("Ninth --> " + copyListToAnother(removeItem(updateElement(arrayLists(),"blue"))));
    }

    // Task 1
    // Write a program to create a new list of arrays,
    // add several colors (line) and display the collection on the screen.

    static List<String> arrayLists() {
        List<String> ListColors = new ArrayList<>();
        ListColors.add("red");
        ListColors.add("green");
        ListColors.add("blue");
        return ListColors;
    }

    // Task 2
    // Write a program to iterate all color list items and add
    // to each character '!'.

    static List<String> enumerationElements(List<String> list) {
        ListIterator<String> ListtoAdd = list.listIterator();
        while (ListtoAdd.hasNext()) {
            ListtoAdd.set(ListtoAdd.next().concat("!"));
        }
        return list;
    }

    // Task 3
    // Write a program to insert an item into the list
    // arrays in the first position.

    static List<String> insertToList(List<String> list) {
        list.add(0, "RGB");
        return list;
    }

    // Task 4
    // Write a program to extract the item (at the specified index)
    // from the specified list.

    static String extractItem(List<String> list) {
        return list.get(0);
    }

    // Task 5
    // Write a program to update a specific array element
    // to a specified element.

    static List<String> updateElement(List<String> list, String element) {
        list.set(list.indexOf(element),"RGB");
        return list;
    }

    // Task 6
    // Write a program to remove the third item from the array list.

    static List<String> removeItem(List<String> list) {
        list.remove(2);
        return list;
    }

    // Task 7
    // Write a program to search for an item in the array list.

    static boolean searchElement(List<String> list, String element) {
        if (list.contains(element))
            return true;
        else
            return false;
    }

    // Task 8
    // Write a program to sort the specified list of arrays.

    static List<String> sortedList(List<String> list) {
        Collections.sort(list);
        return list;
    }

    // Task 9
    // Write a program to copy one list of arrays to another.

    static List<String> copyListToAnother(List<String> list) {
        List<String> newList = List.copyOf(list);
        return newList;
    }
}
