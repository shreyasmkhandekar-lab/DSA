package binaryseachtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);

        myBST.rDeleteNode(2);

        // System.out.println(myBST.root.left.left.left.value); // 5

        // System.out.println(myBST.contains(56));
        // System.out.println(myBST.contains(27));
        // System.out.println(myBST.contains(29));

        // System.out.println(myBST.rContains(27));
        // System.out.println(myBST.rContains(10));

        System.out.println(myBST.root.value);
        System.out.println(myBST.root.left.value);
        System.out.println(myBST.root.right);
    }
}

