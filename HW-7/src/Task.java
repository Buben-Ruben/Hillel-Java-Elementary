import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("\nEnter an example to calculate the maximum nesting depth in it.\n(For example (1+(2*3)+((8)/4))+1): ");
        String s = sc.nextLine();
        char[] sArr = s.toCharArray();
        int depth = 0;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sArr[i]=='(') {
                n += 1;
                depth = Math.max(depth, n);
            } else if (sArr[i]==')') {
                n -= 1;
                depth = Math.max(depth, n);
            }
        }
        System.out.println("\nS = "+s);
        System.out.println("Maximum nesting S's depth: "+depth);
    }
}
