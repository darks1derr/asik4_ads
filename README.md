# Assignment 4: Graph Traversal and Representation System

## Project Overview
This project demonstrates graph traversal algorithms using Java.
The graph is represented using an adjacency list.

Algorithms implemented:
- Breadth-First Search (BFS)
- Depth-First Search (DFS)

---

## Classes

### Vertex
Represents a graph vertex.

### Edge
Represents a connection between two vertices.

### Graph
Stores the adjacency list and traversal methods.

### Experiment
Runs performance tests and measures execution time.

---

## Algorithms

### BFS
BFS explores neighbor vertices level by level.

Time Complexity:
O(V + E)

### DFS
DFS explores vertices deeply before backtracking.

Time Complexity:
O(V + E)

---

## Experimental Results

Graphs tested:
- 10 vertices
- 30 vertices
- 100 vertices

Execution time is measured using:
```java
System.nanoTime();
```

---

## Reflection
This assignment helped understand graph structures and traversal algorithms.
BFS is useful for shortest paths, while DFS is useful for deep exploration.
