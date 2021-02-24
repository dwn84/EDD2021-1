/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *
 * @author samaniw
 */
public class SingleLinkedList<T> implements ILists<T> {

    private Node<T> head;

    public SingleLinkedList() {
        head = null;
    }

    @Override
    public void add(T d) {
        //1. Crear un nuevo nodo
        Node<T> newNode = new Node<>(d);
        //2. Modificar el siguiente del nuevo nodo(cabeza)
        newNode.setNextNode(head);
        //3. Cambiar la cabeza de la lista(nuevo nodo)
        head = newNode;
    }

    @Override
    public void addLast(T d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAfter(T a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteFirts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(T d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String showData() {
        if(isEmpty()){
            return "Lista vacia";
        }else{
            String info ="";         
            for (Node<T> i = head; i!=null; i=i.getNextNode()) {
                info = info + i.getData() + " - ";
            } 
            
            //forma tradicional de recorrer lista con Mientras
            /*Node<T> currentNode = head;
            while (currentNode!=null) {
                info = info + currentNode.getData();
                currentNode = currentNode.getNextNode();
            }*/
            return info;
        }
        

    }

    @Override
    public boolean isEmpty() {
        return head == null;/*
        if (head == null) {
            return true;
        } else {
            return false;
        }*/

    }

    @Override
    public boolean search(T d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
