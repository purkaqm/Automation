package utils;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import pages.exception.NotLoggedInException;


public class ExcelUtils {

    private static HSSFSheet ExcelWSheet;
    private static HSSFWorkbook ExcelWBook;


    public void setExcelFile(String Path, String SheetName) throws Exception {

        // Open the Excel file

        FileInputStream ExcelFile = new FileInputStream(Path);

        // Access the required test data sheet

        ExcelWBook = new HSSFWorkbook(ExcelFile);
        ExcelWSheet = ExcelWBook.getSheet(SheetName);

    }

    public String[][] getTableArray(String filePath) throws Exception {
        return (String[][]) getTableArray(filePath, "Sheet1");
    }

    public Object[][] getTableArray(String FilePath, String SheetName) throws Exception {

        String[][] tabArray = null;

        try {
            FileInputStream ExcelFile = new FileInputStream(FilePath);

            // Access the required test data sheet

            ExcelWBook = new HSSFWorkbook(ExcelFile);
            ExcelWSheet = ExcelWBook.getSheet(SheetName);

            int startRow = 0;
            int startCol = 0;
            int ci, cj;
            int totalRows = ExcelWSheet.getLastRowNum() + 1; // +1 is needed, I don't know why
            int totalCols = 2;

            tabArray = new String[totalRows][totalCols];

            ci = 0;

            for (int i = startRow; i < totalRows; i++, ci++) {
                cj = 0;
                for (int j = startCol; j < totalCols; j++, cj++) {

                    tabArray[ci][cj] = getCellData(i, j);
                    // System.out.println(tabArray[ci][cj]);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not read the Excel sheet");
            e.printStackTrace();
        }
        return (tabArray);
    }

    private String getCellData(int RowNum, int ColNum) throws Exception {

        // DataFormatter df = new DataFormatter();

        HSSFCell cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

        cell.setCellType(1);

        return cell.getStringCellValue();
    }


    public int getRowUsed() throws Exception {

        try {
            return ExcelWSheet.getLastRowNum();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw (e);
        }
    }


}