package com.example.comp1011s1st200489011;

import javafx.event.ActionEvent;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class DBUtility {

    private static DBUtility m_instance = null;

    private DBUtility() {
    }

    public static DBUtility Instance() {
        if (m_instance == null) {
            m_instance = new DBUtility();
        }
        return m_instance;
    }
    private static String user = DBCredentials.user;
    private static String password = DBCredentials.password;
    private static String connectURL = "jdbc:mysql://127.0.0.1:3306/f22midterm";


    public static ArrayList<CarSold> getCarsFromDB() {
        ArrayList<CarSold> cars = new ArrayList<>();

        String sql = "SELECT * FROM carSales;";

        try (
                Connection conn = DriverManager.getConnection(connectURL, user, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next()) {
                int carID = resultSet.getInt("carID");
                String model = resultSet.getString("model");
                String make = resultSet.getString("make");
                int modelYear = resultSet.getInt("modelYear");
                Date dateSold = resultSet.getDate("dateSold");
                Double price = resultSet.getDouble("price");

                cars.add(new CarSold(model, make, carID, modelYear, price, dateSold));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }
    public static ArrayList<Integer> getYear(){
        ArrayList<Integer> years = new ArrayList<>();

        String sql = "SELECT dateSold FROM carSales;";

        try (
                Connection conn = DriverManager.getConnection(connectURL, user, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next()) {
                LocalDate dateSold = resultSet.getDate("dateSold").toLocalDate();

                years.add(dateSold.getYear());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return years;
    }

    public void changeScene(ActionEvent event, String s) {
    }
}