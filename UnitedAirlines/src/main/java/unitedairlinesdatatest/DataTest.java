package unitedairlinesdatatest;

import databases.ConnectToSqlDB;
import utilities.DataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataTest {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader readExcel = new DataReader();


    //to insert into mysql
    public static void insertToDB() {
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list, "UnitedAirlines", "search_topics");
    }

    public static List<String> getItemValue() {
        List<String> itemsList = new  ArrayList<>();
        itemsList.add("Covid-19");
        itemsList.add("Refund");
        itemsList.add("Boarding Pass");
        itemsList.add("Baggage");
        itemsList.add("Book a flight");
        return itemsList;
    }

    public static List<String> getDataFromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("UnitedAirlines", "search_topics");
        return list;
    }

    //Excel read
    public static List<String> getDataFromExcel() throws IOException {
        String path = "../UnitedAirlines/UnitedAirlinesExcelData/UnitedAirlinesSearch.xlsx";
        String[] uniAir = readExcel.fileReader2(path, 0);
        for (int i = 1; i <uniAir.length; i++)
            System.out.println(uniAir[i] + " ");
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <uniAir.length; i++) {
            list.add(uniAir[i]);
        }
        return list;
    }
}
