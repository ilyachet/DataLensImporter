package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import controller.SlaController;
import model.SLA;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SlaService implements Service{


    public SLA getSla(String key) throws IOException, InterruptedException {
        SLA sla = new SLA();
        JSONObject jsonObject = new JSONObject(slaController.getSla(key));
        sla.setSlaThis(jsonHandler.JSONToSla(jsonObject));
        jsonObject = new JSONObject(slaController.getSla(key + "lw"));
        sla.setSlaLast(jsonHandler.JSONToSla(jsonObject));
        return sla;
    }
}
