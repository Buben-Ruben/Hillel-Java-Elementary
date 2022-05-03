import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Car> linkedList = new LinkedList<>();

        Car car1 = new Car("Toyota", "White");
        Car car2 = new Car("Ford", "Red");
        Car car3 = new Car("BMW", "White");
        Car car4 = new Car("Hyundai", "Grey");

        linkedList.add(car1);
        linkedList.add(car2);
        linkedList.add(car3);
        linkedList.add(car4);

        Object[] arr = linkedList.toArray();
        System.out.println("\n(1) LinkedList to Array:  "+Arrays.toString(arr));
        System.out.println("(2) get(2) - gets the chosen element of the LinkedList:  "+linkedList.get(2));
        System.out.println("(3) getLast() - gets the last element of the LinkedList:  "+linkedList.getLast());
        System.out.println("(4) getFirst() - gets the first element of the LinkedList:  "+linkedList.getFirst());
        System.out.println("(5) indexOf(car4) - returns the index of the selected element:  "+linkedList.indexOf(car4));
        System.out.println("(6) size() - returns the number of elements in the LinkedList:  "+linkedList.size());
        linkedList.remove(car2);
        System.out.println("(7) remove(car2) - deletes the selected element:  "+linkedList);
        linkedList.removeLast();
        System.out.println("(8) removeLast() - deletes the last element:  "+linkedList);
        linkedList.removeFirst();
        System.out.println("(9) removeFirst() - deletes the first element:  "+linkedList);
        System.out.println("(10) contains(car3) - returns [true] if the selected object is in the LinkedList:  "+linkedList.contains(car3));
        linkedList.addFirst(car4);
        System.out.println("(11) addFirst(car4) - adds an object to the beginning of the LinkedList:  "+linkedList);
        linkedList.addLast(car2);
        System.out.println("(12) addLast(car2) - adds an object to the end of the LinkedList:  "+linkedList);
        linkedList.add(1, car1);
        System.out.println("(13) add(1, car1) - adds an object to the selected position in the LinkedList:  "+linkedList);
    }
}