import deck.Deck;
import stack.Stack;

/**
 * Created by Artyom Karnov on 15.11.16.
 * artyom-karnov@yandex.ru
 **/
public class Main {
    public static void main(String[] args) {
//        int size = 10;
//        FixArray<Integer> fixArray = new FixArray<Integer>(size);
//        for (int i = 0; i < size; i++) {
//            fixArray.add(Integer.valueOf(i), i);
//            System.out.println(fixArray.get(i));
//        }
//        LinkedList<Integer> linkedList = new LinkedList();
//        linkedList.add(0);
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.displayAll();
//        System.out.println();
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.get(3));
//        System.out.println(linkedList.get(4));
//        linkedList.removeFirst();
//        linkedList.removeFirst();
//        linkedList.removeFirst();
//        linkedList.removeFirst();
//        linkedList.removeLast();
//        linkedList.removeLast();
//        linkedList.removeLast();
//        linkedList.removeLast();
//        linkedList.removeLast();
//
//        linkedList.remove(3);
//
//        System.out.println();
//        linkedList.displayAll();

//        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();
//        doubleLinkedList.add(0);
//        doubleLinkedList.add(1);
//        doubleLinkedList.add(2);
//        doubleLinkedList.add(3);
//        doubleLinkedList.add(4);
//        doubleLinkedList.displayFromStarch();
//        System.out.println();
//        doubleLinkedList.displayFromEnd();
        Deck<Integer> deck = new Deck<Integer>();
        deck.push(1);
        deck.push(2);
        System.out.println(deck.pop());
        System.out.println(deck.pop());
    }
}
