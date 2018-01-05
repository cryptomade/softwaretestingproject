import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;

import paths.Graph;
import paths.Search;
import static paths.Search.counter;

public class ReadAndWriteExcelFile {

	
	public static void readXLSFile() throws IOException
	{
		
		InputStream ExcelFileToRead = new FileInputStream("C:/temp/dateInput.xls");
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

		Iterator rows = sheet.rowIterator();

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
                
            visited.add(1);
            searchprimepaths.depthFirstSearch(graph, visited,lastnode);
            
            System.out.println( ",\n" 
	        + counter + " test paths are needed for Prime Path Coverage. " );
	
	}
	

	public static void main(String[] args) throws IOException {


		readXLSFile();

	}
}
