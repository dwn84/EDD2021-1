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
        bbb.Experiment();
        bbb.Experiment(99);
        bbb.Experiment(88, 44);
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
        sll.addOrdered(109);
        sll.addOrdered(11);
        sll.addOrdered(122);

        System.out.println(sll.showData());
        System.out.println(sll.delete(109));
//        sll.add(55);
//        sll.add(66);
//        sll.add(77);
//        sll.add(88);
//        sll.add(99);
//        sll.add(22);
//        sll.add(33);
//        sll.add(715);
//        sll.add(8888);
        System.out.println(sll.showData());

        /*Toda validación retorna falso o verdadero
        int a=55,b=66;
        System.out.println(a!=b);*/
        //Pruebas de lista doble
        DoubleLinkedList<Integer> dll = new DoubleLinkedList<>();
        dll.addLast(33);
        dll.addLast(44);
        dll.addLast(88);
        dll.addLast(66);
        dll.addLast(99);

        System.out.println("Resultados de la lista dobble");
        System.out.println(dll.showData());
        //Falta evitar un NullPointerException al buscar el último dato...
        //dll.addAfter(99,11);
        //System.out.println(dll.showDataDesc());        
//        dll.deleteLast();
//        dll.deleteLast();
//        dll.deleteFirts();

        System.out.println(dll.showData());

        //Pruebas para lista circular simple
        CircularSingleLinkedList<Integer> csl = new CircularSingleLinkedList<>();
        csl.add(11);
        csl.add(77);
        csl.add(88);
        csl.add(101);
        csl.add(33);
        csl.add(44);
        csl.add(55);
        System.out.println("Datos de la lista circular simple");
        System.out.println(csl.showData());
        
        
        
        String aa = "2";
        String bb = "1";
        System.out.println("Resultados de compareTo");
        System.out.println(aa.compareTo(bb));

    }
//Ejemplo de genérico
//https://docs.oracle.com/javase/tutorial/java/generics/types.html

    public static class Box<E> {

        private E[] object;

        public void Experiment() {
            System.out.println("Experiment 1");
        }

        public void Experiment(int x) {
            System.out.println("Experiment " + x);
        }

        public void Experiment(int x, int y) {
            System.out.println("Experiment " + x + y);
        }

        public void set(E[] object) {
            this.object = object;
        }

        public Object get() {
            return object;
        }
    }

}
