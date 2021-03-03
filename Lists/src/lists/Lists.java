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
public class Lists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExampleNode n1 = new ExampleNode();
        ExampleNode n2 = new ExampleNode();
        ExampleNode n3 = new ExampleNode();
        ExampleNode n4 = new ExampleNode();
        ExampleNode n5 = new ExampleNode();
        ExampleNode n6 = new ExampleNode();
        ExampleNode n7 = new ExampleNode();
        ExampleNode n8 = new ExampleNode();
        n1.setData(99);
        n2.setData(88);
        n3.setData(77);
        n4.setData(66);
        n5.setData(55);
        n6.setData(44);
        n1.setNextNode(n2);
        n2.setNextNode(n3);
        n3.setNextNode(n4);
        n4.setNextNode(n5);
        n5.setNextNode(n6);
//        System.out.println("Dato del primer nodo");//avanzar dos nodos y obtener el dato
//        System.out.println(n1.getNextNode().getNextNode().getData());
//        System.out.println("--------");
        System.out.println("");
        //Instaciación de clase con dato genérico
        Box<Integer> bbb = new Box<>();
        Box<Double> ccc = new Box<>();
        Box<String> ddd = new Box<>();
        //Ejemplo de inserción de datos en lista simple
        SingleLinkedList<Integer> sll = new SingleLinkedList<>();
        sll.addOrdered(88);   
        sll.addOrdered(99);   
        sll.addOrdered(101);   
        sll.addOrdered(109);   
        sll.addOrdered(77);   
        sll.addOrdered(109);   
        sll.addOrdered(11);
        sll.addOrdered(122);

        System.out.println(sll.showData());
        sll.delete(109);        
//        sll.add(55);
//        sll.add(66);
//        sll.add(77);
//        sll.add(88);
//        sll.add(99);
//        sll.add(22);
//        sll.add(33);
//        sll.add(715);
//        sll.add(8888);
        
        /*Toda validación retorna falso o verdadero
        int a=55,b=66;
        System.out.println(a!=b);*/
        System.out.println(sll.showData());
        System.out.println("");
        String aa ="2";
        String bb ="1";
        System.out.println("Resultados de compareTo");
        System.out.println(aa.compareTo(bb));

    }
//Ejemplo de genérico
//https://docs.oracle.com/javase/tutorial/java/generics/types.html
    public static class Box<E> {

        private E[] object;

        public void set(E[] object) {
            this.object = object;
        }

        public Object get() {
            return object;
        }
    }

}
