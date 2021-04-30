/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author samaniw
 */
public class MinGraphPath {
    
    private HashMap<String,LinkedList<EdgeNode>> adjacencyList;

    public MinGraphPath() {
        adjacencyList = new HashMap<>();
    }
    
    public void addNode(String nodeName){
        adjacencyList.putIfAbsent(nodeName, new LinkedList<>());
    }
    
    public void addEdge(String source, String destination, int weitgh){
        adjacencyList.get(source).add(new EdgeNode(destination, weitgh));
    }
    
    public String showAdjacencyList(){
        String data="";
        for (String o : adjacencyList.keySet()) {
            System.out.println(o + ": "+getNeighbors(o));            
        }
        return data;
    }
    
    private String getNeighbors(String key){
        String data="";
        LinkedList<EdgeNode> neighbors;
        neighbors = adjacencyList.get(key);
        for (EdgeNode n : neighbors) {
            data += n.getDestinationNode()+ n.getWeight()+" ";    
        }
        return data;
    }
    
}
