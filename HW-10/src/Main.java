import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);
        for (int i = 0; i < 3; i++) integers.add((int) (Math.random()*(10)));
        integers.add(0);

        System.out.println("\nArrayList:  "+integers);
        Object[] arr = integers.toArray();
        System.out.println("\n(1) ArrayList to Array:  "+Arrays.toString(arr));
        System.out.println("(2) Does the ArrayList contain the number 0:  "+integers.contains(0));
        System.out.println("(3) Index of the first number encountered 0:  "+integers.indexOf(0));
        System.out.println("(4) Index of the last number encountered 0:  "+integers.lastIndexOf(0));
        System.out.println("(5) Number of ArrayList elements:  "+integers.size());
        integers.add(5);
        System.out.println("(6) Adding the number 5 to the end of the ArrayList:  "+integers);
        integers.add(1, 10);
        System.out.println("(6.1) Adding the number 10 to the specified position:  "+integers);
        integers.remove(0);
        System.out.println("(7) Deleted chosen number:  "+integers);
        System.out.println("(8) Get element at index 0:  "+integers.get(0));
        System.out.println("(9) Replacing the selected element with another:  "+integers.set(2, 0)+" changed to 0 "+integers);

        System.out.println("(10) Creating an iterator variable:  Iterator<Integer> iterator = integers.iterator();");
        System.out.print("(11) Using method next() and method hasNext to output ArrayList:  ");
        Iterator<Integer> iterator = integers.iterator(); //iterator()
        while (iterator.hasNext()) {
            System.out.print("["+iterator.next()+", ["+iterator.hasNext()+"]] ");
        }
    }
}
