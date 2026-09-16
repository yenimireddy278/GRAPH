package graph;
import java.util.*;


public class GraphBasic {
	// Initializes the adjacency list
    static ArrayList<ArrayList<Integer>> createGraph(int vertices) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        return graph;
    }

    // Connects two vertices (undirected)
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // Prints the adjacency list structure
    static void printGraph(ArrayList<ArrayList<Integer>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + " -> ");
            for (int neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    // 5. Complete Main Method Execution
    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<ArrayList<Integer>> graph = createGraph(vertices);
        
        // Exact edge connections added from the lecture screen:
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 3);
        
        printGraph(graph);
    }
}



	
	