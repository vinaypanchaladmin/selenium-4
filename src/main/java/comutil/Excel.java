package comutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Excel {
	
	Row row ;
	Cell cell ;
	
	@DataProvider(name="pass")
	public Object[][] datareader() throws IOException{
		File f =new File("userdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook w =  new XSSFWorkbook(fis);
		XSSFSheet s = w.getSheet("s1");
		int nor = s.getPhysicalNumberOfRows();
		int noc = s.getRow(0).getPhysicalNumberOfCells();
		
		Object [][] data = new Object[nor][noc];
		for(int i =1;i<nor;i++ ) {
			for(int j= 0;j<noc;j++) {
				row = s.getRow(i);
				cell = row.getCell(j);
				
				if(cell.getCellType()==CellType.STRING) {
					cell.getStringCellValue();
					data[i][j] = cell ;
				}
				else if(cell.getCellType()==CellType.NUMERIC) {
					String.valueOf(cell.getNumericCellValue());
					data[i][j] = cell ;
				}
			}
		}
		
		return data ;
	}

}
