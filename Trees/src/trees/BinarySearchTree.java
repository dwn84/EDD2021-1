/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author niwde
 */
public class BinarySearchTree {

    private BinaryNode root;
    private BinaryNode father;
    private boolean fatherLeftOrRight;

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(int data) {
        root = new BinaryNode(data);
    }

    public BinaryNode search(int data) {
        return search(data, root);
    }

    private BinaryNode search(int data, BinaryNode currentRoot) {
        //casos base
        if (currentRoot.getData() == data) {
            return currentRoot;
        }
        if (currentRoot == null) {
            return null;
        }

        father = currentRoot;

        if (data > currentRoot.getData()) {
            fatherLeftOrRight = true;
            return search(data, currentRoot.getRightNode());
        } else {
            fatherLeftOrRight = false;
            return search(data, currentRoot.getLeftNode());
        }
    }

    public void add(int data) {
        if(root==null){
            root = new BinaryNode(data);
        }else{
            add(data, root);
        }
        
        
    }

    private void add(int data, BinaryNode currentRoot) {
        if (data < currentRoot.getData()) {
            if (currentRoot.getLeftNode() == null) {
                currentRoot.setLeftNode(new BinaryNode(data));
            } else {
                add(data, currentRoot.getLeftNode());
            }
        } else if (currentRoot.getRightNode() == null) {
            currentRoot.setRightNode(new BinaryNode(data));
        } else {
            add(data, currentRoot.getRightNode());
        }
    }

}
