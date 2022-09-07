package h_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class h_5 {
    public static void main(String[] args) {

        // Task 1
        // Declare and initialize hashMap dictionary < String, String >

        HashMap<String, String> dictionary = new HashMap<>();

        // Task 2
        // Add 10 Key - Value pairs to the dictionary.
        // Author and book title for example.

        dictionary.put("The Catcher in the Rye ", " Jerome D. Salinger");
        dictionary.put("Pride and Prejudice ", " Jane Austen");
        dictionary.put("The Great Gatsby ", " Francis Scott Fitzgerald");
        dictionary.put("The Master and Margarita ", " Mikhail Bulgakov");
        dictionary.put("Little Prince ", "Antoine de Saint-Exupéry");
        dictionary.put("Collector ", " John Fowles");
        dictionary.put("Ayn Rand ", " Atlas Shrugged");
        dictionary.put("The Picture of Dorian Gray ", " Oscar Wilde");
        dictionary.put("Fahrenheit 451' ", " Ray Bradbury");
        dictionary.put("Vanity Fair ", " William Thackeray");
        System.out.println("Task 2: " + dictionary + "\n");

        // Task 3
        // Go through the dictionary and add the character "!"

        Iterator<Map.Entry<String, String>> addCharacter = dictionary.entrySet().iterator();
        while (addCharacter.hasNext()) {
            Map.Entry<String, String> e = addCharacter.next();
            dictionary.put(e.getKey(), e.getValue() + "!");
        }
        System.out.println("Task 3: " + dictionary + "\n");

        // Task 4
        // Add a new author and book name if the corresponding key is not was.

        dictionary.putIfAbsent("War and Peace (4 volumes) ", " Leo Tolstoy");
        System.out.println("Task 4: " + dictionary+"\n");

        // Task 5
        // If there is a key specified in the query, 
        // cut the first word from the key value.

        String key = "Little Prince ";
        dictionary.computeIfPresent(key, (k, v) -> v.contains(" ") ? v.substring(v.indexOf(' ')+1): "");
        System.out.println("Task 5: " + dictionary+"\nTask 6:");

        // Task 6
        // Go through the dictionary by others, not such as in paragraph 3,
        // by the method and output the key pairs value to the console.

        dictionary.forEach((k,v) -> System.out.println(k + "-" + v));     
    }

}
