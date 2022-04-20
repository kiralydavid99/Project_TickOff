package com.example.vizsga1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TickOffApi {
    private static final String BASE_URL= "https://api.tickoff.hu";


    public static User[] getFelhasznalok() throws IOException {
        Response response = RequestHandler.get(BASE_URL+"/all-user");
        String json = response.getContent();
        Gson jsonConvert = new Gson();
        if (response.getResponseCode() >= 400){
            String message = jsonConvert.fromJson(json, ApiError.class).getMessage();
            throw new IOException(message);
        }
        Type type = new TypeToken<ArrayList<User>>(){}.getType();
        return jsonConvert.fromJson(json, User[].class);
    }



    public static User userModositas(User modositando) throws IOException {
        Gson jsonConvert = new Gson();
        String filmJson =  jsonConvert.toJson(modositando);
        Response response = RequestHandler.put(BASE_URL + "/" + modositando.getId(), filmJson);

        String json = response.getContent();
        if (response.getResponseCode() >= 400){
            String message = jsonConvert.fromJson(json, ApiError.class).getMessage();
            throw new IOException(message);
        }
        return jsonConvert.fromJson(json,User.class);
    }

    public static boolean UserTorlese(int id) throws IOException {
        Response response = RequestHandler.delete(BASE_URL + "/" + id);

        Gson jsonConvert = new Gson();
        String json = response.getContent();
        if (response.getResponseCode() >= 400){
            String message = jsonConvert.fromJson(json, ApiError.class).getMessage();
            throw new IOException(message);
        }
        return response.getResponseCode() == 204;
    }
}
