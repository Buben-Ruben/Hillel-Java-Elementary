import java.util.Scanner;

public class Main {

    private static Object ExecutionException = "ERROR!";

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        IFib calculate = new IFib() {
            @Override
            public int fib(int number) {
                if (number <= 1) return number;
                else return fib(number-1) + fib(number-2);
            }
        };

        System.out.print("\nInput:\t");
        int number = scanner.nextInt();
        System.out.println(number < 0 || number > 30? ExecutionException :"Output:\t"+calculate.fib(number));
    }

    public interface IFib {
        int fib(int number);
    }
}
