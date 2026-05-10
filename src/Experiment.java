public class Experiment {

    public void runTraversals(Graph g) {
        System.out.println("BFS Traversal:");
        long bfsStart = System.nanoTime();
        g.bfs(0);
        long bfsEnd = System.nanoTime();

        System.out.println("DFS Traversal:");
        long dfsStart = System.nanoTime();
        g.dfs(0);
        long dfsEnd = System.nanoTime();

        System.out.println("BFS Time: " + (bfsEnd - bfsStart) + " ns");
        System.out.println("DFS Time: " + (dfsEnd - dfsStart) + " ns");
    }

    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};

        for (int size : sizes) {
            System.out.println("\\nGraph Size: " + size);

            Graph graph = new Graph();

            for (int i = 0; i < size; i++) {
                graph.addVertex(new Vertex(i));
            }

            for (int i = 0; i < size - 1; i++) {
                graph.addEdge(i, i + 1);
            }

            runTraversals(graph);
        }
    }

    public void printResults() {
        System.out.println("Experiments completed successfully.");
    }
}
