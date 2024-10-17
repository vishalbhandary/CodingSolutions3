package MostAsked;

import java.util.HashMap;
import java.util.Map;

public class Set2 {
    public static void main(String[] args) {
        Set2 set2 = new Set2();
        System.out.println("A Java Program to count the number of words in a string using HashMap");
        String countWordsInString = "This Example String is a String Example";
        Map<String, Integer> wordCount = set2.countWords(countWordsInString);
        System.out.println(wordCount);
    }

    public Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split("\\s+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
}