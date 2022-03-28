package com.example.vizsga1;

import java.io.IOException;

public class TickOffApi {
    public static Response login(String adat) throws IOException {


        Response response = RequestHandler.post("http://localhost:5000/login",adat);
        return response;

    }


}
