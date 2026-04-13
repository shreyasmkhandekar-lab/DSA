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

//  ************************ Recursive Methods **************************** //

    private boolean rContains(Node currentNode, int value){
    if(currentNode == null) return false;

    if(currentNode.value == value) return true;

    if(currentNode.value > value){
        return rContains(currentNode.left, value);
    }else{
        return rContains(currentNode.right, value);
      }
    }

    public boolean rContains(int value){
        return rContains(root, value);
    }

    private Node rInsert(Node currentNode, int value){
        if(currentNode == null) return new Node(value);

        if(value < currentNode.value){
            currentNode.left = rInsert(currentNode.left, value);
        }else if(value > currentNode.value){
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value){
        if(root == null) root = new Node(value);
        rInsert(root,value); 
    }

    public int minValue(Node currentNode){
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    private Node rDeleteNode(Node currentNode, int value){
        if(currentNode == null) return null;

        if(value < currentNode.value){
            currentNode.left = rDeleteNode(currentNode.left, value);
        }
        else if(value > currentNode.value){
            currentNode.right = rDeleteNode(currentNode.right, value);
        }
        else{
            if(currentNode.left== null && currentNode.right == null){
                return null;
            }
            else if(currentNode.left == null){
                currentNode = currentNode.right;
            }
            else if(currentNode.right == null){
                currentNode = currentNode.left;
            }
            else{
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = rDeleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    public void rDeleteNode(int value){
        rDeleteNode(root, value);
    }
}
