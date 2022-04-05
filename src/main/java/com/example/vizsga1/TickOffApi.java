package com.example.vizsga1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class TickOffApi {
    private static final String BASE_URL= "http://localhost:8000";
    public static final String FILM_API_URL = BASE_URL + "/api/film";

    public static List<User> getFelhasznalok() throws IOException {
        Response response = RequestHandler.get(FILM_API_URL);
        String json = response.getContent();
        Gson jsonConvert = new Gson();
        if (response.getResponseCode() >= 400){
            String message = jsonConvert.fromJson(json, ApiError.class).getMessage();
            throw new IOException(message);
        }
        Type type = new TypeToken<List<User>>(){}.getType();
        return jsonConvert.fromJson(json, type);
    }



    public static User userModositas(User modositando) throws IOException {
        Gson jsonConvert = new Gson();
        String filmJson =  jsonConvert.toJson(modositando);
        Response response = RequestHandler.put(FILM_API_URL + "/" + modositando.getId(), filmJson);

        String json = response.getContent();
        if (response.getResponseCode() >= 400){
            String message = jsonConvert.fromJson(json, ApiError.class).getMessage();
            throw new IOException(message);
        }
        return jsonConvert.fromJson(json,User.class);
    }

    public static boolean UserTorlese(int id) throws IOException {
        Response response = RequestHandler.delete(FILM_API_URL + "/" + id);

        Gson jsonConvert = new Gson();
        String json = response.getContent();
        if (response.getResponseCode() >= 400){
            String message = jsonConvert.fromJson(json, ApiError.class).getMessage();
            throw new IOException(message);
        }
        return response.getResponseCode() == 204;
    }
}
