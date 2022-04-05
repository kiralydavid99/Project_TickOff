package com.example.vizsga1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;

public class LoginController extends Controller {
    @javafx.fxml.FXML
    private TextField jelszo;
    @javafx.fxml.FXML
    private TextField felhasznalonev;

    @javafx.fxml.FXML
    public void LoginButtonClick(ActionEvent actionEvent) {
        String password = jelszo.getText();
        String username = felhasznalonev.getText();
        HashMap<String,String> login = new HashMap<>();
        login.put("email_or_username",username);
        login.put("password",password);
        JSONObject loginJson = new JSONObject(login);
        Response loginResponse = null;
        try {
             loginResponse = RequestHandler.post("https://api.tickoff.hu/login",loginJson.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (loginResponse != null && loginResponse.getResponseCode()<400){
            System.out.println(loginResponse.getContent());
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard-view.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.onCloseRequestProperty().setValue(e -> Platform.exit());
                stage.show();

            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        else{
            JSONObject hiba = new JSONObject(loginResponse.getContent());
            alert("Hibás felhasználónév vagy jelszó");

        }


    }
}
