package primepaths;

public class Vertex {

	Integer name;
	Neighbor adjList;
	Vertex(Integer number, Neighbor ngbrs){
		this.name = number;
		this.adjList = ngbrs;
	}
	
}