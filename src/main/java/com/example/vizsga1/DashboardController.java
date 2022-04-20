package com.example.vizsga1;

import javafx.event.ActionEvent;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class DashboardController {
    private ArrayList<User> userek;
    @javafx.fxml.FXML
    private TableView userTable;
    @javafx.fxml.FXML
    private AnchorPane Anchor;
    @javafx.fxml.FXML
    private AreaChart<Number,Number> Statisztika;
    @javafx.fxml.FXML
    private TableColumn<User,String>  Felhasznalolista;
    @javafx.fxml.FXML
    private TableColumn<User,Integer> KorLista;
    @javafx.fxml.FXML
    private TableColumn <User,Integer>RegisztracioLista;

    public void initialize(){
        Felhasznalolista.setCellValueFactory(new PropertyValueFactory<>("username"));
        KorLista.setCellValueFactory(new PropertyValueFactory<>("born_date"));
        RegisztracioLista.setCellValueFactory(new PropertyValueFactory<>("register_date"));
        try {
            userek = new ArrayList<>(Arrays.asList(TickOffApi.getFelhasznalok()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        userTable.getItems().clear();
        for (User adat:
             userek) {
            userTable.getItems().add(adat);

        }
    }

    @javafx.fxml.FXML
    public void Regisztracio(ActionEvent actionEvent) {
        userTable.setVisible(false);
        Statisztika.setVisible(true);


    }



}
