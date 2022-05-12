package HW12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        GoodPairs goodPairs = new GoodPairs();

        System.out.println("\n--------------Jewels And Stones--------------");
        System.out.print("Enter Jewels String: ");
        String jewels = sc.nextLine();
        System.out.print("Enter Stones String: ");
        String stones = sc.nextLine();
        System.out.println("Answer: " + jewelsAndStones.numberOfJewels(jewels, stones) + " Stones you have are also Jewels.");
        System.out.println("---------------------------------------------");

        System.out.println("\n-----------------Good  Pairs-----------------");
        System.out.print("Enter the size of the array of numbers: ");
        int sizeArr = sc.nextInt();
        int[] arr = new int[sizeArr];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number into array: index[" + i + "]  ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Answer: Found " + goodPairs.numberOfPairs(arr) + " good pairs in the array.");
        System.out.println("---------------------------------------------");
    }
}
