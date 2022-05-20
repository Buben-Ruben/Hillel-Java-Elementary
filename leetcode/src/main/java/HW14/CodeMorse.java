package HW14;

import java.util.HashSet;
import java.util.Set;

public class CodeMorse {
    public int morseEncryption(String[] words) {
        Set<String> seen = new HashSet();
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-", "...-",".--","-..-","-.--","--.."};

        for (String word: words) {
            StringBuilder encryption = new StringBuilder();
            for (char i: word.toCharArray()) encryption.append(morse[i - 'a']);
            seen.add(encryption.toString());
        }

        System.out.print(seen + " Output: ");
        return seen.size();
    }
}
