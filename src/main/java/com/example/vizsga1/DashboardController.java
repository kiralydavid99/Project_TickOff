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


public class DashboardController {

    @javafx.fxml.FXML
    private TableView<User> userTable;
    @javafx.fxml.FXML
    private AnchorPane Anchor;
    @javafx.fxml.FXML
    private AreaChart<Number,Number> Statisztika;
    @javafx.fxml.FXML
    private TableColumn<User,String>  Felhasznalolista;
    @javafx.fxml.FXML
    private TableColumn<User,String> KorLista;
    @javafx.fxml.FXML
    private TableColumn <User,String> RegisztracioLista;
    @javafx.fxml.FXML
    private TableColumn KeresztnevList;
    @javafx.fxml.FXML
    private TableColumn EmailcimLista;
    @javafx.fxml.FXML
    private TableColumn VezeteknevList;

    public void initialize(){
        Felhasznalolista.setCellValueFactory(new PropertyValueFactory<>("username"));
        KorLista.setCellValueFactory(new PropertyValueFactory<>("born_date"));
        RegisztracioLista.setCellValueFactory(new PropertyValueFactory<>("register_date"));
        KeresztnevList.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        VezeteknevList.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        EmailcimLista.setCellValueFactory(new PropertyValueFactory<>("email"));


        felhasznaloListaFeltolt();
    }
    private void felhasznaloListaFeltolt() {
        try {
            ArrayList<User> userList = TickOffApi.getFelhasznalok();
            userTable.getItems().clear();
            for (User felhasz : userList){
                userTable.getItems().add(felhasz);
            }
        } catch (IOException e) {

        }
    }

    @javafx.fxml.FXML
    public void Regisztracio(ActionEvent actionEvent) {
        userTable.setVisible(false);
        Statisztika.setVisible(true);


    }


    @javafx.fxml.FXML
    public void felhasznaloTorles(ActionEvent actionEvent) {


    }

    @javafx.fxml.FXML
    public void felhasznaloModositas(ActionEvent actionEvent) {
    }
}
