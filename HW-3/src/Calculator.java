import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Enter first num: ");
        double firstNum = sc.nextDouble();
        System.out.print("Enter second num: ");
        double secondNum = sc.nextDouble();
        System.out.println("\nEnter what operation you want to perform with the number 5 and 0.");
        System.out.println("Operation example: (+, -, * , /), type exit - to exit the program");
        System.out.print("\nEnter your choice: ");
        String choice = sc.next();

        switch (choice) {
            case "+":
                System.out.println(firstNum+" + "+secondNum+" = "+(firstNum+secondNum));
                break;
            case "-":
                System.out.println(firstNum+" - "+secondNum+" = "+(firstNum-secondNum));
                break;
            case "*":
                System.out.println(firstNum+" * "+secondNum+" = "+(firstNum*secondNum));
                break;
            case "/":
                System.out.println(firstNum+" / "+secondNum+" = "+(firstNum/secondNum));
                break;
            case "exit":
                System.out.println("Program closed.");
                return;
            default:
                System.out.println("Error!");
        }
    }
}
