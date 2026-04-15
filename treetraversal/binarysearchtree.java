package treetraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class binarysearchtree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

//  ************************ Tree Traversal **************************** //

//  ***** BFS ******* //


    public ArrayList<Integer> BFS(){
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(currentNode);

        while(queue.size() > 0){
            currentNode = queue.remove();
            result.add(currentNode.value);
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return result;
    }


//  ***** DFS - PreOrder ******* //

    public ArrayList<Integer> DFSPreOrder(){
        ArrayList<Integer> result = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){
                result.add(currentNode.value);
                if(currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right != null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }

//  **************************************************** //

//  ***** DFS - PostOrder ******* //

    public ArrayList<Integer> DFSPostOrder(){
        ArrayList<Integer> result = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){
                if(currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right != null){
                    new Traverse(currentNode.right);
                }
                result.add(currentNode.value);
            }
        }

        new Traverse(root);
        return result;
    }

//  **************************************************** //


//  ***** DFS - PostOrder ******* //

    public ArrayList<Integer> DFSInOrder(){
        ArrayList<Integer> result = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){
                if(currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                result.add(currentNode.value);
                if(currentNode.right != null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }

//  **************************************************** //


//  ************************ Regular Methods **************************** //


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
