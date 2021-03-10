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
public class DoubleLinkedList<T extends Number & Comparable> implements ILists<T> {

    private DoubleNode<T> head;
    private DoubleNode<T> tail;

    public DoubleLinkedList() {
        head = tail = null;
    }

    @Override
    public void add(T d) {
        //verificar si la lista esta vacia
        if (isEmpty()) {
            head = tail = new DoubleNode<>(d);
        } else {
            //1.Crear un nuevo nodo con un siguiente apuntando a la cabeza
            DoubleNode<T> newNode = new DoubleNode<>(null, d, head);
            //2. Cambiar el anterior de la cabeza, para que sea el nuevo nodo
            head.setPreviousNode(newNode);
            //3. Actualizar la cabeza de la lista, para que sea el nuevo nodo
            head = newNode;
        }

    }

    @Override
    public void addLast(T d) {
        if (isEmpty()) {
            head = tail = new DoubleNode<>(d);
        } else {
            //1. Crear nuevo nodo: el anterior es la cola y el siguente es nulo
            DoubleNode<T> newNode = new DoubleNode<>(tail, d, null);
            //2. Cambiar el siguiente de la cola para que sea el nuevo nodo
            tail.setNextNode(newNode);
            //3. Actualizar la cola para que sea el nuevo nodo
            tail = newNode;
        }
    }

    @Override
    public void addAfter(T d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOrdered(T d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteFirts() {

        if (isEmpty()) {
            System.out.println("Lista sin datos");
        } else //Verificar que si la lista tiene un solo dato
        {
            if (head == tail) {
                head = tail = null;
            } else {
                //1. Actualizar la cabeza: siguiente de la cabeza actual
                head = head.getNextNode();
                //2. Cambiar el anterior de la cabeza para que sea null
                head.setPreviousNode(null);
            }
        }

    }

    @Override
    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("Lista sin datos");
        } else //Verificar que si la lista tiene un solo dato
        {
            if (head == tail) {
                head = tail = null;
            } else {
                //1. Actualizar la cabeza: siguiente de la cabeza actual
                tail = tail.getPreviousNode();
                //2. Cambiar el anterior de la cabeza para que sea null
                tail.setNextNode(null);
            }
        }
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

    public String showDataDesc() {
        if (isEmpty()) {
            return "Lista vacia";
        } else {
            String info = "";
            for (DoubleNode<T> i = tail; i != null; i = i.getPreviousNode()) {
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
