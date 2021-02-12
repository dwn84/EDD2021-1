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
    //Ejemplo de analisis de pila de llamadas(call stack)

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

//ejemplo de recursividad lineal final
    public void repetir(int x) {

        //caso base
        if (x == 0) {
            System.out.println("Fin del proceso");
        } else {

            System.out.println(x);
            repetir(x - 1);

        }

    }

//Ejemplo de recursividad lineal no final    
    public int sumatoria(int n) {
        //caso base 
        System.out.println("");
        if (n == 1) {
            return 1;
        } else {
            return n + sumatoria(n - 1);
        }
    }
//Ejemplo de recursividad lineal no final    

    public double factorial(double n) {
        System.out.println("");
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    //Ejemplo de recursividad múltiple

    public int fibo(int n) {
        //casos base       
        System.out.println("");
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    //Ejemplo de recursividad mutua    
    //Determinar si un número es par
    public boolean par(int n) {
        if (n == 0) {
            return true;
        } else {
            return impar(n - 1);
        }
    }

    private boolean impar(int n) {
        if (n == 0) {
            return false;
        } else {
            return par(n - 1);
        }
    }

    //ejemplo máximo común divisor
    public int gcd(int a, int b) {
        //caso base
        if (a == b) {
            return a;
        } else if (a > b) {
            return gcd(a-b,b);
        }else{
            return gcd(a,b-a);
        }
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
        System.out.println("Sumatoria = " + r.sumatoria(5));
        System.out.println("Factorial = " + r.factorial(4));
        System.out.println("Elemento en la posicion 5 de fibonacci: " + r.fibo(5));
        System.out.println("Validar si 8 es par: " + r.par(8));
        System.out.println("M.C.D de 14 y 8 es:"+ r.gcd(14, 8));

    }

}
