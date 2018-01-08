package webbasedgraphtesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;

import primepaths.Graph;
import primepaths.Search;
import static primepaths.Search.counter;

public class ReadAndWriteExcelFile {

	
	public static void readXLSFile(String uploadedfile) throws IOException
	{
                
		InputStream ExcelFileToRead = new FileInputStream(uploadedfile);
		HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);

		HSSFSheet sheet=wb.getSheetAt(0);
		HSSFRow row; 
		HSSFCell cell;
                
                Graph graph = new Graph();
                Search searchprimepaths = new Search();
                LinkedList<Integer> visited = new LinkedList();
                Integer node1 = null;
                Integer node2 = null;
                int lastnode =0;

                //Excel file is read and write over here
		Iterator rows = sheet.rowIterator();

                //Each row and each cell is got from excel file and processed,
                //then results are written in a excel file
		while (rows.hasNext())
		{
			row=(HSSFRow) rows.next();
			Iterator cells = row.cellIterator();
			while (cells.hasNext())
			{
				cell=(HSSFCell) cells.next();
		
				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
				{
					System.out.print(cell.getStringCellValue()+" ");
				}
				else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
				{
                                        node1 = (int)cell.getNumericCellValue();
					System.out.print((int)cell.getNumericCellValue()+" ");
                                        cell=(HSSFCell) cells.next();
				}
				else
				{
					//U Can Handel Boolean, Formula, Errors
				}
                                node2 = (int)cell.getNumericCellValue();
                                System.out.print((int)cell.getNumericCellValue()+" ");
			}
                        graph.addEdge(node1, node2);  
                        lastnode=node2;
			System.out.println();
		}
            //Depth first search occured over here  
            visited.add(1);
            searchprimepaths.depthFirstSearch(graph, visited,lastnode);
            
            //Here is to see all on console also
            System.out.println( ",\n" 
	        + counter + " test paths are needed for Prime Path Coverage. " );
	
	}


}