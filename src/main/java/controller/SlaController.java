package controller;

import service.JSONHandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SlaController implements Controller{


    public String getSla(String key) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        String path = "";
        switch (key) {
            case "2" :
                path = FILE_PATH_2_LINE;
                break;
            case "2lw" :
                path = FILE_PATH_2_LINE_LW;
                break;
            case "3" :
                path = FILE_PATH_3_LINE;
                break;
            case "3lw" :
                path = FILE_PATH_3_LINE_LW;
                break;
            case "c" :
                path = FILE_PATH_CHATS;
                break;
            case "clw" :
                path = FILE_PATH_CHATS_LW;
        }

        String requestBody = jsonHandler.JSONFileToString(path);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .header("Authorization", "OAuth " + TOKEN)
                .header("Content-Type", "application/json; charset=utf-8")
                .POST(HttpRequest.BodyPublishers.ofString("{\n" +
                        "  \"params\": {\n" +
                        "    \"name\": \"/Users/ilyachet18/sla\"," + requestBody))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
