package pertemuan14_graph;

public class GraphMain {
	
	// Latihan 5
	public static void main(String[] args) {
		Graph g = new Graph(5);
		// Menambah Vertex
		g.addVertex('A'); // 0
		g.addVertex('B'); // 1
		g.addVertex('C'); // 2
		g.addVertex('D'); // 3
		g.addVertex('E'); // 4
		// Menambah Edge
		g.addEdge(0, 1); // AB
		g.addEdge(1, 2); // BC
		g.addEdge(0, 3); // AD
		g.addEdge(3, 4); // DE
		
		g.adjacencyMatrix();
		System.out.println();
		
		// Latihan 6
		System.out.println("-=Latihan 6=-");
		g = new Graph(4);
		// Menambah Vertex
		g.addVertex('A'); // 0
		g.addVertex('B'); // 1
		g.addVertex('C'); // 2
		g.addVertex('D'); // 3
		// Menambah Edge
		g.addEdge(0, 1); // AB
		g.addEdge(0, 2); // AC
		g.addEdge(0, 3); // AD
		g.addEdge(1, 3); // BD
		
		g.adjacencyMatrix();
		System.out.println();
	}

}
