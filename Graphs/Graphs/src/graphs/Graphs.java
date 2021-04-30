/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.HashMap;
import java.util.PriorityQueue;

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
        
        MinGraphPath mgp = new MinGraphPath();
        mgp.addNode("A");
        mgp.addNode("B");
        mgp.addNode("C");
        mgp.addNode("D");
        mgp.addEdge("A", "B", 2);
        mgp.addEdge("A", "C", 5);
        mgp.addEdge("B", "C", 2);
        mgp.addEdge("B", "D", 5);
        System.out.println("Lista de adyacencia de grafo con arcos que tienen peso");
        System.out.println(mgp.showAdjacencyList());
        
        
        
        //implementar un hashmap - mapa de recorrido
        HashMap<String,EdgeNode> map = new HashMap<>();
        map.putIfAbsent("A",new EdgeNode("", 0));
        map.putIfAbsent("B",new EdgeNode("A", 2));
        map.putIfAbsent("X",new EdgeNode("A", 5));
        
        for (String k : map.keySet()) {
            
            System.out.print(k + " ");            
            System.out.print(map.get(k).getWeight()+ " ");
            System.out.print(map.get(k).getDestinationNode()+ "\n");

        }
        
        //cola priorizada de nodos(con su respectivo peso)
        PriorityQueue<EdgeNode> PQ = new PriorityQueue<>();
        
        PQ.add(new EdgeNode("C", 5));
        PQ.add(new EdgeNode("B", 2));
        PQ.add(new EdgeNode("D", 7));
        
    //    System.out.println(PQ);
 
        System.out.println("");
        
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
        dg.addNode();
        dg.addNode();
        dg.addNode();
        dg.addNode();
        try {
            dg.addEdge(0, 2);
            dg.addEdge(2, 4);
            dg.addEdge(2, 5);
            dg.addEdge(2, 3);
            dg.addEdge(2, 1);
            dg.addEdge(4, 6);
            dg.addEdge(1, 7);
            dg.addEdge(1, 8);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Recorrido en anchura: BFS");
        dg.BFS(0);
        System.out.println("");
        System.out.println("Recorrido en profundidad: DFS");
        dg.DFS(0);
//        System.out.println("lista de adyacencia");
//        System.out.println(dg.showAdjacencyList());
//        
//   
//        System.out.println("lista de adyacencia");
//        System.out.println(dg.showAdjacencyList());
//        
//        System.out.println("Lista de arcos");
//        System.out.println(dg.edgeList());
        
        
        System.out.println("");

    }
    
}
