package com.example.comp1011s1st200489011;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {


        @FXML
        private Button ChangetoGraphView;

        @FXML
        private TableView<CarSold> tableView;

        @FXML
        private TableColumn<CarSold, Integer> carID;

        @FXML
        private TableColumn<CarSold, Integer> modelYear;

        @FXML
        private TableColumn<CarSold, String > make;

        @FXML
        private TableColumn<CarSold, String> model;

        @FXML
        private TableColumn<CarSold, Double> price;

        @FXML
        private TableColumn<CarSold, Date> dateSold;

        @FXML
        void OnChangetoGraphViewClicked(ActionEvent event) throws IOException {
            DBUtility.Instance().changeScene(event, "population-graphview.fxml");
        }


        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

            carID.setCellValueFactory(new PropertyValueFactory<>("carId"));
            modelYear.setCellValueFactory(new PropertyValueFactory<>("modelYear"));
            make.setCellValueFactory(new PropertyValueFactory<>("make"));
            model.setCellValueFactory(new PropertyValueFactory<>("model"));
            price.setCellValueFactory(new PropertyValueFactory<>("price"));
            dateSold.setCellValueFactory(new PropertyValueFactory<>("dateSold"));



        }
    }

