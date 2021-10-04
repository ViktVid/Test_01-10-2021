package basePack_01_10_Test;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.Package;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class XcelReader {
    File file;
    FileInputStream fis;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell; //column

    public XcelReader(String filePath) throws IOException, InvalidFormatException {
        this.file = new File(filePath);
        this.fis = new FileInputStream(file);
        this.wb = new XSSFWorkbook(Package.open(fis));
    }

    public String getStringData(String sheetName, int rowNumber, int cellNumber) {
        this.sheet = wb.getSheet(sheetName);
        this.row = sheet.getRow(rowNumber);
        this.cell = row.getCell(cellNumber);
        return this.cell.getStringCellValue();
    }

    public int getIntegerData(String sheetName, int rowNumber, int cellNumber) {
        this.sheet = wb.getSheet(sheetName);
        this.row = sheet.getRow(rowNumber);
        this.cell = row.getCell(cellNumber);
        return (int) this.cell.getNumericCellValue();
    }

    public int getLastRowNumber() {
        return sheet.getLastRowNum();
    }
}