public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();

        System.out.println("\n\n(1) isEmpty() Returns True if List is empty:  " + arrayList.isEmpty());
        arrayList.add(1);
        System.out.println("(2) add() Adding the number to the end of the List:  " + arrayList);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("//Add some more numbers...  " + arrayList);
        System.out.println("(3) size() Returns size of List:  " + arrayList.size());
        System.out.println("(4) get(1) Returns element at index 1:  " + arrayList.get(1));
        arrayList.remove(3);
        System.out.println("(5) remove(3) Removes element at index 3:  " + arrayList);
        arrayList.set(0,3);
        System.out.println("(6) set(0, 0) Replaces the element at index 0 with the specified value:  " + arrayList);
        System.out.println("(7) hasNext() Returns True if if there is a next element in the list:  " + arrayList.iterator().hasNext());
        arrayList.add(0, 4);
        System.out.println("(8) add(1, 4) Adds an element to the selected position:  " + arrayList);
        System.out.println("(9) indexOf(3) Returns the index of the first number encountered 3:  " + arrayList.indexOf(3));
        System.out.println("(10) lastIndexOf(3) Returns the index of the first number encountered 3:  " + arrayList.lastIndexOf(3));
    }
}
