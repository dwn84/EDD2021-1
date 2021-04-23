/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author niwde
 */
public class DynamicGraph {

    private ArrayList<LinkedList<Integer>> adjacencyList;
    private int totalNodes;
    LinkedList<Integer> aaa = new LinkedList<>();

    public DynamicGraph() {
        adjacencyList = new ArrayList<>();
        totalNodes = 0;

    }

    public void addNode() {
        adjacencyList.add(totalNodes++, new LinkedList<>());    
    }

    public void addEdge(int source, int destination) throws Exception {
        if (source >=totalNodes || destination >=totalNodes) {
            //preguntar si se desar agregar el nodo: invocar al metodo addNode
            throw new Exception("No existe el nodo");
        }
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }
    
    public void deleteNode(int node){
        adjacencyList.get(node).clear();
        /*recorrer la lista de adyacencia y eliminar los elementos los elementos
        de destino*/
        int i = 0;
        for (LinkedList<Integer> n : adjacencyList) {
            for (Integer d : n) {
                if(d==node){
                    //System.out.println("Origen: " + i + "destino: " + d);
                    int nodeToDelete = adjacencyList.get(i).indexOf(d);
                    adjacencyList.get(i).set(nodeToDelete, null);
                    
                }
            }
            i++;
        }
    }
    
    public String showAdjacencyList(){
        String data="";
        int i = 0;
        for (LinkedList<Integer> node : adjacencyList) {
            data += i++ + ": " + node+"\n";
        }        
        return data;
    }
    public String edgeList(){
        String data="";
        int i = 0;
        for (LinkedList<Integer> node : adjacencyList) {            
            if(node.size()!=0){                
                for (Integer destination : node) {
                    data += i +" "+ destination + "\n";
                }
            }
            i++;
        }        
        return data;
    }
    /**
     * Recorrido en anchura
     * @param u nodo actual
     */
    public void BFS(int u){
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[totalNodes];
        visited[u]=true;
        
        queue.add(u);
        
        while (!queue.isEmpty()) {
            u=queue.poll();//u = Q.front, Q.pop
            System.out.print(u+" ");
            for(Integer v: adjacencyList.get(u)){
            //if v is unvisited
                if(!visited[v]){
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }
    
    public void DFS(int u){
        boolean[] visited=new boolean[totalNodes];
        DFS(u,visited);
    }
    
    private void DFS(int u, boolean[] visited){
        visited[u] = true;
        System.out.print(u + " ");
        for(Integer v: adjacencyList.get(u)){
            if(!visited[v]){
                DFS(v,visited);
            }
        }
    }

}
