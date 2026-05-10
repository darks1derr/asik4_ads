public class Main {
    public static void main(String[] args) {

        Graph graph = new Graph();

        for (int i = 0; i < 10; i++) {
            graph.addVertex(new Vertex(i));
        }

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 7);
        graph.addEdge(6, 8);
        graph.addEdge(7, 9);

        System.out.println("Graph Structure:");
        graph.printGraph();

        Experiment experiment = new Experiment();

        System.out.println("\\nRunning Traversals:");
        experiment.runTraversals(graph);

        System.out.println("\\nRunning Multiple Tests:");
        experiment.runMultipleTests();

        experiment.printResults();
    }
}
