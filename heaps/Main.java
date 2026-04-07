package heaps;

public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);
        myHeap.insert(79);
        myHeap.insert(18);
        myHeap.insert(45);

        System.out.println(myHeap.getHeap());

        myHeap.remove();

        System.out.println(myHeap.getHeap());

        myHeap.remove();

        System.out.println(myHeap.getHeap());

    }
}
