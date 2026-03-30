package binaryseachtree;

public class BinarySearchTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

    public boolean insert(int value){
        Node newnNode = new Node(value);
        if(root == null){
            root = newnNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(newnNode.value == temp.value) return false;
            if(newnNode.value < temp.value){
                if(temp.left == null){
                    temp.left = newnNode;
                    return true;
                }
                temp = temp.left;
            }else{
                if(temp.right == null){
                    temp.right = newnNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value){
        if(root == null) return false;
        Node temp = root;
        while(temp != null){
            if(value < temp.value){
                temp = temp.left;
            }else if(value > temp.value){
                temp = temp.right;
            }else{
                return true;
            }
        }
        return false;
    }
}
