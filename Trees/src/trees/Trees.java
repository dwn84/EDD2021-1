/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author samaniw
 */
public class Trees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code applicatio¡n logic here
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(88);
        bst.add(33);
        bst.add(99);
        bst.add(44);
        bst.add(22);
        bst.add(101);
        //bst.delete(88);
        System.out.println("Pre-orden");
        bst.preOrder();
        System.out.println("\nIn-orden");
        bst.inOrder();
        System.out.println("");
        
        
    }
    
}
