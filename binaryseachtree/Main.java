package binaryseachtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(30);
        myBST.insert(15);
        myBST.insert(56);
        myBST.insert(12);
        myBST.insert(77);
        myBST.insert(5);
        myBST.insert(50);

        myBST.insert(27);

        // System.out.println(myBST.root.left.left.left.value); // 5

        System.out.println(myBST.contains(56));
        System.out.println(myBST.contains(27));
        System.out.println(myBST.contains(29));
    }
}

