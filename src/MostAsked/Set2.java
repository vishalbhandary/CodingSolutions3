package MostAsked;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Set2 {
    public static void main(String[] args) {
        Set2 set2 = new Set2();
        System.out.println("A Java Program to count the number of words in a string using HashMap");
        String countWordsInString = "This Example String is a String Example";
        Map<String, Integer> wordCount = set2.countWords(countWordsInString);
        System.out.println(wordCount);

        System.out.println("Java Program to iterate HashMap using While and advance for loop");
        Map<String, String> map = new HashMap<>();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        map.put("Key3", "Value3");

        System.out.println("Iterating over HashMap:");
        set2.iterateHashMap(map);
    }


    public Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split("\\s+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
    public void iterateHashMap(Map<String, String> map) {
        // Using advanced for-loop
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // Using while-loop with iterator
        Iterator<Map.Entry<String, String>> iterator =
                map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}