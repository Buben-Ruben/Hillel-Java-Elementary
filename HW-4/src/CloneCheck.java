import java.util.Arrays;

public class CloneCheck {
    public static void main(String[] args) {
        String[] word1 = {"Bu","bu","n"};
        String[] word2 = {"Bubun"};
        System.out.println("\nWord1 = "+Arrays.toString(word1)+"\nWord2 = "+Arrays.toString(word2)+"\n" +
                "String is same?: "+String.join("",word1).equals(String.join("",word2)));
    }
}
