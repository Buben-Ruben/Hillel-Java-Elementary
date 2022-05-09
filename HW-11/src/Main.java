import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        System.out.println("\n\n(1) isEmpty() Returns True if List is empty:  " + linkedList.isEmpty());
        linkedList.add(2);
        System.out.print("(2) add() Adding the object to the end of the List:  ");
        for (int n : linkedList) System.out.print(n+" ");
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(8);
        System.out.print("\n//Add some more object...  ");
        for (int n : linkedList) System.out.print(n+" ");
        System.out.println("\n(3) size() Returns size of List:  " + linkedList.size());
        System.out.println("(4) get(3) Returns element at index 1:  " + linkedList.get(3));
        linkedList.set(0,10);
        System.out.print("(5) set(0, car5) Replaces the element at index 0 with the specified value:  ");
        for (int n : linkedList) System.out.print(n+" ");
        System.out.println("\n(6) hasNext() Returns True if if there is a next element in the list:  " + linkedList.iterator().hasNext());
        linkedList.add(0, 10);
        System.out.print("(7) add(0, car1) Adds an element to the selected position:  ");
        for (int n : linkedList) System.out.print(n+" ");
        System.out.println("\n(8) indexOf(10) Returns the element index of the number encountered 10:  " + linkedList.indexOf(10));
        System.out.print("(9) Iterator from the beginning of the list:  ");
        for (int n : linkedList) System.out.print(n+" ");
        System.out.print("\n(10) Iterator from the end of the list:  ");
        Iterator iterator = linkedList.myListIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}