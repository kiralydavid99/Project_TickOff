package com.example.vizsga1;

import javafx.event.ActionEvent;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class DashboardController {
    private ArrayList<User> userek;
    @javafx.fxml.FXML
    private TableView userTable;
    @javafx.fxml.FXML
    private AnchorPane Anchor;
    @javafx.fxml.FXML
    private AreaChart<Number,Number> Statisztika;

    public void initialize(){
        // összes felhasználó listázása
    }

    @javafx.fxml.FXML
    public void Regisztracio(ActionEvent actionEvent) {
        userTable.setVisible(false);
        Statisztika.setVisible(true);
        gombValami();

    }
    private void gombValami(){
        NumberAxis x = new NumberAxis(1,2,3);
        NumberAxis y = new NumberAxis(5,4,3);
        Statisztika = new AreaChart<Number, Number>(x,y);
        Statisztika.setTitle("asd");

    }


}
