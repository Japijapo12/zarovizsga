package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashMap;
import java.util.Map;

public class DigitsCounter {

    public int getCountOfDigits(String s) {

        int count = 0;
        if (s == null || s.isEmpty()) {
            return 0;
        }


        Map<Character, Integer> countOfLetters = new HashMap<>();
        for (char c : s.toCharArray()) {

            if (countOfLetters.containsKey(c)) {
                countOfLetters.put(c, countOfLetters.get(c) + 1);
            } else {
                countOfLetters.put(c, 1);
            }
        }

        return countOfLetters.keySet().size();


    }
}
