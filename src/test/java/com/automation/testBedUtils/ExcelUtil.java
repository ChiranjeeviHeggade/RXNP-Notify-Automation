package com.automation.testBedUtils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
@Author-Subhankar Das
 */
public class ExcelUtil {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelUtil(String excelPath, String sheetName) {
        try {
            FileInputStream file = new FileInputStream(excelPath);
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheet(sheetName);

        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }

    public int getRowCount() {
        // System.out.println("No of rows : " + rowCount);
        return sheet.getPhysicalNumberOfRows();

    }

    public Object getCellData(int rowNum, int colNum) {
        try {
            DataFormatter formatter = new DataFormatter();
            return formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
        } catch (Exception e) {
            e.printStackTrace();
            return "row " + rowNum + " or column " + colNum + " does not exist in excel";
        }

    }

    public Object getCellData(String colName, int rowNum) {
        try {
            DataFormatter formatter = new DataFormatter();
            Object value = null;
            int i;
            int count = getColumnCount();
            for (i = 0; i < count; i++) {
                //considering 1st row as header
                String Actual_ColName = sheet.getRow(0).getCell(i).toString();
                if (Actual_ColName.equalsIgnoreCase(colName)) {
                    value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(i));

                }
            }
            return value;
        } catch (Exception e) {
            e.printStackTrace();
            return "row " + rowNum + " or column Name" + colName + " does not exist in excel";
        }

    }

    public int getColumnCount() {
        return sheet.getRow(0).getPhysicalNumberOfCells();

    }


    public void setCellData(int rowNum, int colNum, String data) {
        try {
            if (sheet.getRow(rowNum).getCell(colNum) == null) {
                sheet.getRow(rowNum).createCell(colNum).setCellValue(data);
            } else {
                sheet.getRow(rowNum).getCell(colNum).setCellValue(data);
            }
            System.out.println("File write at Row number: " + rowNum + " and Column Number: " + colNum + " with data: " + data + " is successful");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCellData(int rowNum, String colName, String data) {
        try {
            int i;
            int count = getColumnCount();
            for (i = 0; i < count; i++) {
                //considering 1st row as header
                String Actual_ColName = sheet.getRow(0).getCell(i).toString();
                if (Actual_ColName.equalsIgnoreCase(colName)) {
                    Row r;
                    if (sheet.getRow(rowNum) != null) {
                        r = sheet.getRow(rowNum);
                    } else {
                        r = sheet.createRow(rowNum);
                    }
                    try {
                        r.getCell(i).setCellValue(data);
                    } catch (NullPointerException e) {
                        r.createCell(i).setCellValue(data);
                    }

                }

            }
            System.out.println("File write at Row number: " + rowNum + " and Column Name: " + colName + " with data: " + data + " is successful");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeWorkBook(String excelPath) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(excelPath);
        workbook.write(outputStream);
        workbook.close();
    }

    // cell data should be unique
    public int getCellIndex(Object cellData) {
        int index = 0;
        DataFormatter formatter = new DataFormatter();
        for (int i = 0; i < getRowCount(); i++) {
            for (int j = 0; j < getColumnCount(); j++) {
                if (formatter.formatCellValue(sheet.getRow(i).getCell(j)).equals(cellData)) {
                    index = i;
                }
            }
        }
        return index;
    }


}
