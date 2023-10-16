package pertemuan14_graph;

public class Vertex {
	
	// Latihan 1
	private char label; // label (e.g. 'A')
	private boolean wasVisited;
	
	public Vertex(char lab) {
		label = lab;
		wasVisited = false;
	}

	public char getLabel() {
		return label;
	}

	public void setLabel(char label) {
		this.label = label;
	}

	public boolean isWasVisited() {
		return wasVisited;
	}

	public void setWasVisited(boolean wasVisited) {
		this.wasVisited = wasVisited;
	}

}
