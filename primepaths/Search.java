package paths;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class Search {

    public static int counter = 0; 
    int r=0;

    
                static String excelFileName = "C:/temp/demo.xls";//name of excel file

		static String sheetName = "Sheet1";//name of sheet
    		static HSSFWorkbook wb = new HSSFWorkbook();
		static HSSFSheet sheet = wb.createSheet(sheetName) ;
    
		    public void depthFirstSearch(Graph graph, LinkedList<Integer> visited, int end) throws IOException {
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
		    
		    
		    private void printPath(LinkedList<Integer> visited) throws IOException {
                        
                      
                      HSSFRow row = sheet.createRow(r);
                            int c=0;
		    	for (Integer node : visited) {
                            			
                                                HSSFCell cell = row.createCell(c);
				
                                                cell.setCellValue( node);
						System.out.print(node);
						System.out.print(" ");	
                                                c++;
		        }
                        
                        r++;
		        System.out.println();
                        
                FileOutputStream fileOut = new FileOutputStream(excelFileName);
		
		//write this workbook to an Outputstream.
		wb.write(fileOut);
		fileOut.flush();
		fileOut.close();
		        
		    }

    }
	
