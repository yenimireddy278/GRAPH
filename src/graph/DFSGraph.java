package graph;

import java.util.*;

public class DFSGraph {

    static void dfs(ArrayList<ArrayList<Integer>> graph, int current, boolean[] visited) {
        // Mark the current node as visited
        visited[current] = true;
        
        // Print the current node
        System.out.print(current + " ");
        
        // Traverse all the neighbors of the current node
        for (int neighbour : graph.get(current)) {
            // If the neighbor hasn't been visited, recurse
            if (!visited[neighbour]) {
                dfs(graph, neighbour, visited);
            }
        }
    }
    public static void main(String[] args) {
        // Example setup to test the DFS implementation
        int vertices = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(vertices);
        
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Adding edges to create an example graph
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        
        // Keep track of visited nodes
        boolean[] visited = new boolean[vertices];
        
        System.out.println("DFS traversal starting from node 0:");
        dfs(graph, 0, visited);
    }
}

