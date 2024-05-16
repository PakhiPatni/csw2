package DataStructure;
import java.util.*;

class Graph1 {
    private LinkedList<Integer>[] adjacencyList;
    private int numVertices;

    public Graph1(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];

        for (int i = 0; i < numVertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjacencyList[src].add(dest);
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[numVertices];
        dfsUtil(start, visited);
    }

    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjacencyList[vertex]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }
}

public class prog9 {
    public static void main(String[] args) {
        int numVertices = 5;
        Graph1 graph = new Graph1(numVertices);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("Depth-First Search (DFS):");
        graph.dfs(0);
    }
}

/**
 * OUTPUT
 * 
 * Depth-First Search (DFS):
 * 0 1 3 2 4 
 */