package DLL;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(8);
        myDLL.append(9);
        myDLL.append(10);
        myDLL.printList();
        System.out.println("======");
        // myDLL.remove(2);
        // myDLL.insert(0, 6);
        // myDLL.set(0, 6);
        // System.out.println(myDLL.get(2).value);;
        // myDLL.removeFirst();
        // myDLL.prepend(6);
        // myDLL.removeLast();
        // myDLL.getHead();
        // myDLL.getTail();
        // myDLL.getLength();

        myDLL.printList();
    }
    
}