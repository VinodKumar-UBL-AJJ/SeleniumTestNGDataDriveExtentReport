package dataDrivenFramework;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenPOI {


	public static String[][] readExcel() throws IOException { 

		XSSFWorkbook wb= new XSSFWorkbook("./data/TC001.xlsx");

		XSSFSheet ws = wb.getSheetAt(0);
		
		int rowsCount = ws.getLastRowNum();
		
		
		int cellCount = ws.getRow(0).getLastCellNum();
	
		
		String[][] data = new String[rowsCount][cellCount];
		
		
		
		  for (int i = 1; i <= rowsCount; i++) {
		  
			for (int j = 0; j < cellCount; j++) {
		  
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
		  
				data[i - 1][j] = cellValue;
		 		  
		  
		  }
		  
		  
		  
	}
		  
		
		wb.close();
		
		
		return data;

	}

	}



