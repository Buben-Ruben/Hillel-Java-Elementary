package HW13;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        SortedArray ssa = new SortedArray();
        MaximumValue maxValue = new MaximumValue();

        System.out.println("\n---------------Max Value Sol..---------------");
        System.out.print("Enter the size of array: ");
        int sizeSol = sc.nextInt();
        int[] arrSol = new int[sizeSol];
        for (int i = 0; i < arrSol.length; i++) {
            System.out.print("Enter number into array: index[" + i + "]  ");
            arrSol[i] = sc.nextInt();
        }
        System.out.println("Result: " + maxValue.maxSolution(arrSol));
        System.out.println("---------------------------------------------");

        System.out.println("\n-------------Sorted Square Array-------------");
        System.out.print("Enter the size of array: ");
        int sizeSort = sc.nextInt();
        int[] arrSort = new int[sizeSort];
        for (int i = 0; i < arrSort.length; i++) {
            System.out.print("Enter number into array: index[" + i + "]  ");
            arrSort[i] = sc.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(ssa.arrayToSquare(arrSort)));
        System.out.println("---------------------------------------------");

    }
}
