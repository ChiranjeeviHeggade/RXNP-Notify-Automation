package com.automation.testBedUtils;

import org.apache.maven.shared.invoker.SystemOutHandler;

import java.io.IOException;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class TestOutputUtil {
    private static final String path = System.getProperty("user.dir");
    private static final String fileName = "Pharmacy_Output.xlsx";
    private static final String fileLocation = path + "/src/test/resources/TestBed/" + fileName;

//    public static void main(String[] args) {
//        writeTestOutputToExcel("Login", "login to pharmacy", "12334", "test");
//        writeTestOutputToExcel("Logout", "logout to pharmacy", "12534", "test");
//
//    }

    //Get TC ID, TC Description, RX#, Activity
    public void writeTestOutputToExcel(String TC_Name, String TC_DESC, String Rx, String Activity) {
        if (TC_Name != null) {
            ExcelUtil excelUtil = new ExcelUtil(fileLocation, "Output");
            int row = excelUtil.getRowCount();
            excelUtil.setCellData(row, "TimeStamp", getTimeStamp());
            excelUtil.setCellData(row, "TcName", TC_Name);
            excelUtil.setCellData(row, "TcDescription", TC_DESC);
            excelUtil.setCellData(row, "Rx#", Rx);
            excelUtil.setCellData(row, "Activity", Activity);
            try {
                excelUtil.closeWorkBook(fileLocation);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("NO TC Name found to write into Excel..");
        }
    }

    public static String getTimeStamp() {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
    }

    public static void createTxT() {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void createList() {
        try {
            File myObj = new File("emailList.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeList(String txt) {
        try {
            FileWriter myWriter = new FileWriter("emailList.txt", true);
            myWriter.write(txt);
            myWriter.close();
            System.out.println("Successfully added to list.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("new email to list: " + readTxt() );
    }

    public void writeTxt(String txt) {
        createTxT();
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(txt);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("new email is: " + readTxt() );

//        createList();
//        writeList(txt + "\n");
    }

    public String readTxt() {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                return data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
}
