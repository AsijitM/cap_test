package pdf.edge;

public class Edge {
	public final int fromNode;
	public final int toNode;
	//for singleton obj extracted from factory method
	private Edge(int fromNode,int toNode) {
		this.fromNode=fromNode;
		this.toNode=toNode;
	}
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		Edge edge=(Edge)o;
		if(this.fromNode==edge.fromNode && this.toNode==edge.toNode) {
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		return (int)((fromNode *100000L+toNode)%1000000007);
	}
	
	public String toString() {
		return ("From node: "+this.fromNode+" To node: "+this.toNode);
	}
	
	public static Edge createEdge(int fromNode,int toNode) {
		return new Edge(fromNode,toNode);
	}

}
