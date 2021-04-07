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
public class StaticGraph {
    private boolean AdjacencyMatrix[][];

    public StaticGraph(int n) {
        AdjacencyMatrix = new boolean[n][n];
    }

    public void addEdge(int source, int destination){
        AdjacencyMatrix[source][destination] = true;
        AdjacencyMatrix[destination][source] = true;
    }
    
}
