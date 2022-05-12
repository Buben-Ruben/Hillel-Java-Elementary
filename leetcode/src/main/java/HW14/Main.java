package HW14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        CodeMorse codeMorse = new CodeMorse();
        HappyNum happyNum = new HappyNum();

        System.out.println("\n-----------------Code  Morse-----------------");
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter String into array: index[" + i + "]  ");
            arr[i] = sc.next();
        }
        System.out.println(codeMorse.morseEncryption(arr));
        System.out.println("---------------------------------------------");

        System.out.println("\n----------------Happy  Number----------------");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Result: Number " + num + " is Happy? " + happyNum.isHappy(num));
        System.out.println("---------------------------------------------");

    }
}
