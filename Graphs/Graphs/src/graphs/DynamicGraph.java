/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.ArrayList;
import java.util.LinkedList;

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
        adjacencyList.add(totalNodes, new LinkedList<>());
        totalNodes++;
    }

    public void addEdge(int source, int destination) throws Exception {
        if (source >= (totalNodes - 1) || destination <= (totalNodes - 1)) {
            throw new Exception("No existe el nodo");
        }
    }
}
