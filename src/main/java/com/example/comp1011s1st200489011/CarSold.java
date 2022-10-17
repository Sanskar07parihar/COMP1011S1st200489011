package com.example.comp1011s1st200489011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CarSold {
    private String model, make;
    private int carID, modelYear;
    private double price;
    private Date dateSold;

    public CarSold(String model, String make, int carID, int modelYear, double price, Date dateSold) {
        setModel(model);
        setMake(make);
        setCarID(carID);
        setModelYear(modelYear);
        setPrice(price);
        setDateSold(dateSold);
    }

    public void setModel(String model) {
        if (model.length() > 1){
            this.model = model;
        }
        else {
            System.out.println("Model should be at least 2 character long");
        }

    }

    public static List<String> getMake(){
        List<String> makes = Arrays.asList("Acura", "Ford", "Honda", "Nissan", "Tesla");
        return makes;
    }
    public void setMake(String make) {
        List<String> makes = getMake();
        if(makes.contains(make)){
            this.make = make;
        }else {
            System.out.println(" value of make should be Acura, Ford,Honda, Nissan,Tesla");
        }
    }

    public void setCarID(int carID) {
        if (carID > 0){
            this.carID = carID;
        }else{
            System.out.println("Car Id must be greater than 0");
        }

    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        }else{
            System.out.println("Price must be greater than 0");
        }
    }

    public void setDateSold(Date dateSold) {
            this.dateSold = dateSold;
    }
}
