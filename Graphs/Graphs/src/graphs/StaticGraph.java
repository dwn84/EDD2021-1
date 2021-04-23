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
    private int totalNodes;

    public StaticGraph(int n) {
        AdjacencyMatrix = new boolean[n][n];
        totalNodes = n;
    }

    public void addEdge(int source, int destination) {
        AdjacencyMatrix[source][destination] = true;
        AdjacencyMatrix[destination][source] = true;
    }

    public void deleteEdge(int source, int destination) throws Exception {
        if (source > totalNodes || destination > totalNodes) {
            throw new Exception("No es posible borrar el arco, no existe");
        } else {
            AdjacencyMatrix[source][destination] = false;
        }
    }

    public String showAdjacencyMatrix() {
        String aM = "";

        for (int i = 0; i < totalNodes; i++) {
            for (int j = 0; j < totalNodes; j++) {
                aM += (AdjacencyMatrix[i][j]) ? 1 : 0;
            }
            aM += "\n";
        }        
        return aM;

    }
    

}
