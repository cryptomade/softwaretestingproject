package primepaths;


import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

public class Graph {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Map<Integer, LinkedHashSet<Integer>> map = new HashMap();

	/*
	 * Adding all the edges in LinkedHashSet
	 */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public void addEdge(Integer node1, Integer node2) {
        LinkedHashSet<Integer> adjacent = map.get(node1);
        if(adjacent==null) {
            adjacent = new LinkedHashSet();
            map.put(node1, adjacent);
        }
        adjacent.add(node2);
    }


    @SuppressWarnings({ "rawtypes", "unchecked" })
	public LinkedList<Integer> adjacentNodes(Integer last) {
        LinkedHashSet<Integer> adjacent = map.get(last);
        if(adjacent==null) {
            return new LinkedList();
        }
        return new LinkedList<Integer>(adjacent);
    }

	
	
}