/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

/**
 *
 * @author samaniw
 */
class pruebaRecursividad {

    public void repetir(int x) {
        //caso base
        if (x == 0) {
            System.out.println("Fin del proceso");
        } else {
            System.out.println(x);
            repetir(x - 1);
        }

    }

    public void proceso1() {
        int x = 11;
        System.out.println("");
        proceso2();
    }

    public void proceso2() {
        int x = 22;
        System.out.println("");
        proceso3();
    }

    public void proceso3() {
        int y = 33;
        System.out.println("");
        proceso4();
    }

    public void proceso4() {
        int m = 44;
        System.out.println("");
    }

}

public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pruebaRecursividad r = new pruebaRecursividad();
        r.proceso1();
        r.repetir(20);

    }

}
