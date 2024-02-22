package comut2;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data2 {

	  Row row ;
	  Cell cell ;
	
	  
	  @DataProvider(name="hlo")
	public Object[][] myread() throws Exception{
		File f = new File("./data/userdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook w =  new XSSFWorkbook(fis);
		XSSFSheet s = w.getSheet("userdata");
		int nor = s.getPhysicalNumberOfRows();
		int noc = s.getRow(0).getPhysicalNumberOfCells();
		System.out.println(nor);
		System.out.println(noc);
		
		Object[][] data = new Object[nor][noc];
		for(int i=1;i<nor;i++) {
			for(int j=0;j<noc;j++) {
				row = s.getRow(i);
				cell = row.getCell(j);
			
				if(cell.getCellType()==CellType.NUMERIC) {
					String.valueOf(cell.getNumericCellValue());
					data[i][j] =cell ;
					System.out.print(data[i][j]+" ");
				}
				else if(cell.getCellType()==CellType.STRING) {
					data[i][j] =cell ;
					System.out.print(data[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		return data ;
	}
	

public static void main (String args[]) throws Exception {
	Data2 d =new Data2();
	d.myread();
}
}




