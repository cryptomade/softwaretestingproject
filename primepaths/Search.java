package paths;

import java.util.LinkedList;
//import java.util.Scanner;


public class Search {

    public static int counter = 0; 
    
		    public void depthFirstSearch(Graph graph, LinkedList<Integer> visited, int end) {
		        LinkedList<Integer> nodes = graph.adjacentNodes(visited.getLast());
		        // examine adjacent nodes
		        
		        for (Integer node : nodes) {
		            if (visited.contains(node)) {
		                continue;
		            }
		            if (node.equals(end)) {
		                visited.add(node);		                
		                printPath(visited);
		                visited.removeLast();
		                break;
		            }
		        }
		        
		        for (Integer node : nodes) {
		            if (visited.contains(node) || node.equals(end)) {
		                counter++;
		            	continue;                
		            }
		            visited.addLast(node);
		            depthFirstSearch(graph, visited,end);
		            visited.removeLast();
		        }
		        
		    }
		    
		    
		    private void printPath(LinkedList<Integer> visited) {
                        
                        
					
		    	for (Integer node : visited) {
		
						System.out.print(node);
						System.out.print(" ");		            
		        }

		        System.out.println();
		        
		    }
		    

    
    }
	