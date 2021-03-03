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
public class SingleLinkedList<T extends Number & Comparable> implements ILists<T> {

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
    public void addAfter(T d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteFirts() {
        if (isEmpty()) {
            System.out.println("Lista vacía");
        } else {
            //cambiar cabeza
            //la nueva cabeza será el siguiente de la cabeza actual
            head = head.getNextNode();
        }
    }

    @Override
    public void deleteLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(T d) {
        //1. Validar si el dato a borrar esta en la cabeza
        if (head.getData() == d) {
            deleteFirts();
        }else{
            //2. Recorrer toda la estructura
            Node<T> currentNode = head;
            while(currentNode.getNextNode()!=null) {
                //3. Verificar si el dato se encuentra en el siguiente nodo
                if(currentNode.getNextNode().getData()==d){
                    //4.Cambiar el siguiene del actual para que se ubique dos pasos adelante
                    currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                }
                //5. Avanzar un nodo
                if(currentNode.getNextNode()!=null){
                    currentNode = currentNode.getNextNode();
                }                
                //System.out.println("");
            }
        }
    }

    @Override
    public String showData() {
        if (isEmpty()) {
            return "Lista vacia";
        } else {
            String info = "";
            for (Node<T> i = head; i != null; i = i.getNextNode()) {
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

    @Override
    public void addOrdered(T d) {
        //Crear un nodo para el nuevo dato.
        Node<T> newNode = new Node<>(d);
        /*Si la lista esta vacía, o el valor del primer elemento de la lista 
            es mayor que el nuevo, insertar el nuevo nodo en la primera posición 
            de la lista y modificar la cabecera respectivamente.*/
        if (isEmpty() || newNode.getData().compareTo(head.getData()) == -1) {
            add(d);
        } /*
        Si no se cumple el caso anterior, buscar el lugar adecuado 
        para la inserción: recorrer la lista conservando el nodo actual. 
        Inicializar nodo actual con el valor de primera posición, 
        y avanzar mientras el siguiente nodo no sea nulo y el dato que 
        contiene la siguiente posición sea menor o igual que el dato a insertar.
         */ else {
            Node<T> currentNode = head;
            while (currentNode.getNextNode() != null
                    && currentNode.getNextNode().getData().compareTo(d) < 0) {
                //avanzar
                currentNode = currentNode.getNextNode();
            }
            /*
            Con esto se seña al nodo adecuado, a continuación insertar el 
            nuevo nodo a continuación de él
             */
            newNode.setNextNode(currentNode.getNextNode());
            currentNode.setNextNode(newNode);
        }

    }

}
