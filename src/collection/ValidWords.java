package collection;

import java.util.ArrayList;
import java.util.List;

public class ValidWords {
    public static void main(String[] args) {

        String input = "javva microserviece dev@ops np089";
        String[] words = input.split(" ");

        List<String> validWords = new ArrayList<>();

        for (String word : words) {
            // check length <= 4 and only alphabets
            if (word.length() <= 4 && word.matches("[a-zA-Z]+")) {
                validWords.add(word);
            }
        }

        System.out.println(validWords);
    }
}
