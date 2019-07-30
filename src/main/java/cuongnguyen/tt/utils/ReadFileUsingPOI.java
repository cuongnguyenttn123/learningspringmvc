package cuongnguyen.tt.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cuongnguyen.tt.model.Country;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFileUsingPOI {
    public static List<Country> readFileUsingPOI(String path) throws IOException
    {
        List<Country> countries=new ArrayList();

        FileInputStream inputStream = new FileInputStream(new File(path));

        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        Iterator iterator = sheet.iterator();
        while (iterator.hasNext()) {
            Row nextRow = (Row) iterator.next();

            // Not creating country object for header
            if(nextRow.getRowNum()==0)
                continue;
            Country countryObj=new Country();
            Iterator cellIterator = nextRow.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = (Cell) cellIterator.next();
                int columnIndex=cell.getColumnIndex();
                switch (columnIndex+1) {
                    case 1:
                        countryObj.setName(cell.getStringCellValue());
                        break;
                    case 2:
                        countryObj.setCapital(cell.getStringCellValue());
                        break;
                    case 3:
                        countryObj.setPopulation(cell.getNumericCellValue());
                        break;
                }

            }
            countries.add(countryObj);

        }
        workbook.close();
        inputStream.close();
        return countries;

    }
}
