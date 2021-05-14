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
        } else if (currentRoot == null) {
            return null;
        } else {

            father = currentRoot;

            if (data > currentRoot.getData()) {
                fatherLeftOrRight = true;
                return search(data, currentRoot.getRightNode());
            } else {
                fatherLeftOrRight = false;
                return search(data, currentRoot.getLeftNode());
            }
        }
    }

    public void add(int data) {
        if (root == null) {
            root = new BinaryNode(data);
        } else {
            add(data, root);
        }

    }

    private void add(int data, BinaryNode currentRoot) {
        //casos base
        if (data < currentRoot.getData()) {//caso base 1
            if (currentRoot.getLeftNode() == null) {
                currentRoot.setLeftNode(new BinaryNode(data));
            } else {
                add(data, currentRoot.getLeftNode());
            }
        } else if (currentRoot.getRightNode() == null) {//caso base 2
            currentRoot.setRightNode(new BinaryNode(data));
        } else {
            add(data, currentRoot.getRightNode());
        }
    }

    public void delete(int data) {
        if (root == null) {
            System.out.println("Arbol vacio");
        } else {
            delete(data, root);
        }
    }

    private void delete(int data, BinaryNode currentRoot) {
        //casos base

        BinaryNode tempNode = search(data);
        if (tempNode == null) {
            System.out.println("No existe el nodo");
        } else {
            //Si el nodo que se va a eliminar es una hoja, 
            //su nodo padre apuntará ahora hacia vacío.
            if (tempNode.isLeaf()) {//caso base 1
                //identificar la dirección de desplazamiento
                if (fatherLeftOrRight) {
                    father.setRightNode(null);
                } else {
                    father.setLeftNode(null);
                }
            } else if (tempNode.oneChild()) {//caso base 2
                //Si el nodo por borrar tiene solo un hijo, 
                //su respectivo padre apuntará directamente a dicho nodo hijo.

                if (tempNode.isLeftOrRight()) {//donde este el hijo? Derecha
                    //identificar la dirección de desplazamiento
                    if (fatherLeftOrRight) {
                        father.setRightNode(tempNode.getRightNode());
                    } else {
                        father.setLeftNode(tempNode.getRightNode());
                    }
                    //donde este el hijo? Izquierda
                } else if (fatherLeftOrRight) {
                    father.setRightNode(tempNode.getLeftNode());
                } else {
                    father.setLeftNode(tempNode.getLeftNode());
                }
            }
        }
    }
}


