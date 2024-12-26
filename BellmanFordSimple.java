import java.util.Arrays;

public class BellmanFordSimple {
    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        // Define the graph
        int vertices = 4;
        int edgesCount = 5;

        // Create edges
        Edge[] edges = new Edge[edgesCount];
        edges[0] = new Edge(0, 1, -1);
        edges[1] = new Edge(0, 2, 4);
        edges[2] = new Edge(1, 2, 3);
        edges[3] = new Edge(1, 3, 2);
        edges[4] = new Edge(2, 3, -2);

        // Run Bellman-Ford algorithm from source vertex 0
        bellmanFord(vertices, edges, 0);
    }

    static void bellmanFord(int vertices, Edge[] edges, int source) {
        int[] dist = new int[vertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        // Relax edges (vertices - 1) times
        for (int i = 0; i < vertices - 1; i++) {
            for (Edge edge : edges) {
                if (dist[edge.src] != Integer.MAX_VALUE && dist[edge.src] + edge.weight < dist[edge.dest]) {
                    dist[edge.dest] = dist[edge.src] + edge.weight;
                }
            }
        }

        // Check for negative-weight cycles
        for (Edge edge : edges) {
            if (dist[edge.src] != Integer.MAX_VALUE && dist[edge.src] + edge.weight < dist[edge.dest]) {
                System.out.println("Graph contains a negative-weight cycle");
                return;
            }
        }

        // Print the result
        System.out.println("Vertex\tDistance from Source (" + source + ")");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + "\t" + (dist[i] == Integer.MAX_VALUE ? "∞" : dist[i]));
        }
    }
}

