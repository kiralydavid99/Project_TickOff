package com.example.vizsga1;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;

public class LoginController {
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
             loginResponse = TickOffApi.login(loginJson.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (loginResponse != null){
            System.out.println(loginResponse.getContent());
        }
    }
}
