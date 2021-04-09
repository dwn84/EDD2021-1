/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author samaniw
 */
public class Graphs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //pruebas de grafo estático
        StaticGraph sg = new StaticGraph(4);
        sg.addEdge(0, 2);
        sg.addEdge(1, 2);
        sg.addEdge(0, 3);
        System.out.println("Matriz de adyacencia");
        System.out.println(sg.showAdjacencyMatrix());
        //sg.deleteEdge(5, 9);               
        int n=0, m=99;        
        try{
            sg.deleteEdge(3, 0);
            sg.deleteEdge(m, n);//genera la excepción diseñada en el método
            
        }catch(Exception errorcito){
            System.out.println(errorcito.getMessage());
        }               
        System.out.println("Matriz de adyacencia");
        System.out.println(sg.showAdjacencyMatrix());
        
        //pruebas de grafo dinámico
        DynamicGraph dg = new DynamicGraph();
        dg.addNode();
        dg.addNode();
        dg.addNode();
        dg.addNode();
        dg.addNode();
        System.out.println("");

    }
    
}
