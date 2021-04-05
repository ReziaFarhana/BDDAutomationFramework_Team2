package datatest;

import databases.ConnectToSqlDB;
import org.testng.annotations.Test;
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
        connectToSqlDB.insertDataFromArrayListToSqlTable(list, "TripAdvisor", "searchData");
    }

    //
    public static List<String> getItemValue() {
        List<String> itemsList = new ArrayList<>();
        itemsList.add("Mexico");
        itemsList.add("Italy");
        itemsList.add("Japan");
        itemsList.add("Bangladesh");
        itemsList.add("Maldives");
        return itemsList;
    }

    public static List<String> getDataFromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("TripAdvisor", "searchData");
        return list;
    }

    public static List<String> getDataFromExcel() throws IOException {
        String path = "../TripAdvisor/Data/tripadvisorsearch.xlsx";
        String[] tripA = readExcel.fileReader2(path, 0);
        for (int i = 1; i < tripA.length; i++)
            System.out.println(tripA[i] + " ");
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < tripA.length; i++) {
            list.add(tripA[i]);
        }
        return list;


    }
}
