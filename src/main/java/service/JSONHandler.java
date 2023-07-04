package service;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONHandler {

    public String JSONFileToString(String path) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(path)));
        return content;
    }

    public double JSONToSla(JSONObject json) {
        return json.getJSONObject("data")
                .getJSONArray("rows")
                .getJSONObject(0)
                .getJSONArray("cells")
                .getJSONObject(0)
                .getDouble("value");
    }
    public int JSONToCount(JSONObject json) {
        JSONArray array = json.getJSONObject("data")
                .getJSONArray("graphs")
                .getJSONObject(0)
                .getJSONArray("data");
        int rez = 0;
        for(int i = 0; i < array.length(); i++) {
            rez += array.getJSONObject(i).getInt("y");
        }

        return rez;
    }
}
