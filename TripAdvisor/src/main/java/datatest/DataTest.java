package datatest;

import databases.ConnectToSqlDB;
import utilities.DataReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataTest {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader readExcel = new DataReader();




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
