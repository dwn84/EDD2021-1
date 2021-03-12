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
public class CircularDoubleLinkedList<T extends Number & Comparable> implements ILists<T> {

    private DoubleNode<T> head;

    public CircularDoubleLinkedList() {
        head = null;
    }

    @Override
    public void add(T d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addLast(T d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAfter(T a, T b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOrdered(T d) {
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
    public boolean delete(T d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String showData() {
        if (isEmpty()) {
            return "Lista vacia";
        } else {
            String info = "";
            for (DoubleNode<T> i = head; i != null; i = i.getNextNode()) {
                info = info + i.getData() + " - ";
            }
            return info;
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean search(T d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
