/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *Define las acciones de las listas (contrato)
 * @author udem
 */
public interface ILists<T> {
    /**
     * Agregar un nuevo dato a la lista al inicio
     * @param d 
     */
    public void add(T d);
    /**
     * Agregar un nuevo dato a la lista al final
     * @param d 
     */
    public void addLast(T d);
    /**
     * Agregar un nuevo dato a la lista despues de una dato existente
     * @param a
     * @param b 
     */
    public void addAfter(T d); 
    /**
     * Borrar el primer elemento de la lista
     */
    
    public void addOrdered(T d);
    
    public void deleteFirts();
    /**
     * Borrar el últiumo elemento de la lista
     */
    public void deleteLast();    
    public void delete(T d);
    public String showData();
    public boolean isEmpty();    
    public boolean search(T d);
}
