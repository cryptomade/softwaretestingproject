package primepaths;

import java.util.LinkedList;
//import java.util.Scanner;

import primepaths.Graph;

public class Search {

	private static Integer START = 1;
    private static Integer END = 15;
    public static int counter = 0; 
    
    public static void main(String[] args) {
    
    /*
	 * Assigning directed acyclic graph 
	 */
		    Graph graph = new Graph();
		    graph.addEdge(1, 2);
		    graph.addEdge(2, 3);
		    graph.addEdge(2, 4);
		    graph.addEdge(3, 4);
		    graph.addEdge(4, 5); 
		    graph.addEdge(4, 6);
		    graph.addEdge(5, 6);
		    graph.addEdge(6, 7);
		    graph.addEdge(6, 8);
		    graph.addEdge(7, 8);
		    graph.addEdge(8, 9);
		    graph.addEdge(8, 10);
		    graph.addEdge(10, 15);
		    graph.addEdge(9, 11);
		    graph.addEdge(11, 12);
		    graph.addEdge(11, 13);
		    graph.addEdge(12, 15);
		    graph.addEdge(13, 15);
		    graph.addEdge(13, 14);
		    graph.addEdge(14, 15);
		    
			@SuppressWarnings({ "unchecked", "rawtypes" })
			LinkedList<Integer> visited = new LinkedList();
			
			
			//Scanner scan = new Scanner(System.in);
			System.out.println("Node Coverage");
			
			//new Search().nodeCover(graph, visited);
			
			System.out.println("Edge Coverage");
			
			System.out.println("Edge-Pair Coverage");
			
			System.out.println("Prime path coverage");
			START = 1;//Integer.valueOf(scan.next());
			System.out.println("Initial node : " + START);
	        visited.add(START);
	        END = 15;//Integer.valueOf(scan.next());	        
	        System.out.println("Final node : " + END);
	        new Search().depthFirstSearch(graph, visited);
	        System.out.println("From " + START + " to " + END + ",\n" 
	        + counter + " test paths are needed for Prime Path Coverage. " );
	        
	        
	        
			try{System.in.read();}
			catch(Exception e){}
			
			 //scan.close();
    }
    		/*
    		 * DepthFirstSearch algorithm starts over here
    		 */
		    private void depthFirstSearch(Graph graph, LinkedList<Integer> visited) {
		        LinkedList<Integer> nodes = graph.adjacentNodes(visited.getLast());
		        // examine adjacent nodes
		        
		        for (Integer node : nodes) {
		            if (visited.contains(node)) {
		                continue;
		            }
		            if (node.equals(END)) {
		                visited.add(node);		                
		                printPath(visited);
		                visited.removeLast();
		                break;
		            }
		        }
		        
		        for (Integer node : nodes) {
		            if (visited.contains(node) || node.equals(END)) {
		                counter++;
		            	continue;                
		            }
		            visited.addLast(node);
		            depthFirstSearch(graph, visited);
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
	

