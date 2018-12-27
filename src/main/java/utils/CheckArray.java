package utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.util.*;


public class CheckArray {

    private String fileName;
    private FileInputStream file;

    private Workbook workbook;

    private String sheetName;

    public CheckArray(String fileName, String sheetName) throws Exception {

        this.fileName = fileName;
        this.sheetName = sheetName;

        workbook = new HSSFWorkbook(new FileInputStream(fileName));
    }

    Row getRow(int rowNum) {
        return workbook.getSheet(sheetName).getRow(rowNum);
    }

    public Cell getCell(int rowNum, int cellNum) {
        return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
    }

    public String getCellData(Cell cell) {

        return cell.getStringCellValue();

    }


    public void checkProvider(String a, String b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    @DataProvider public Iterator<Object[]> example(){
        Set<Object[]> set=new HashSet();
        set.add(new Object[]{"foo",false,true});
        set.add(new Object[]{"foo.bar",true,true});
        return set.iterator();
    }

    private int getRowNumber() {
        return workbook.getSheet(sheetName).getPhysicalNumberOfRows();
    }

    private int getCellNumber() {
        return workbook.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();
    }

}
