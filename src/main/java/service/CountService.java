package service;

import model.SLA;
import org.json.JSONObject;

import java.io.IOException;

public class CountService implements Service{
    public SLA getCount(String key, SLA sla) throws IOException, InterruptedException {
        JSONObject jsonObject = new JSONObject(countController.getCount(key));
        sla.setCountThis(jsonHandler.JSONToCount(jsonObject));
        jsonObject = new JSONObject(countController.getCount(key + "lw"));
        sla.setCountLast(jsonHandler.JSONToCount(jsonObject));
        return sla;
    }
}
