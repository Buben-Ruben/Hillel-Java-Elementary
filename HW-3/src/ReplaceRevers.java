public class ReplaceRevers {

    public static void main(String[] args) {

        String text = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        text = text.replace('Z', ' ');
        String[] textReverse = new StringBuilder(text).reverse().toString().split(" ");

        for (int i = 0; i < textReverse.length/2; i++) {
            String temp = textReverse[textReverse.length-i-1];
            textReverse[textReverse.length-i-1] = textReverse[i];
            textReverse[i] = temp;
        }

        for (String s : textReverse) {
            System.out.print(s + " ");
        }
    }
}
