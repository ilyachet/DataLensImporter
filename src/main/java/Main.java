import controller.CountController;
import controller.SlaController;
import model.SLA;
import org.json.JSONArray;
import org.json.JSONObject;
import service.CountService;
import service.JSONHandler;
import service.SlaService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        SlaService slaService = new SlaService();
        CountService countService = new CountService();

        SLA sla2 = slaService.getSla("2");
        System.out.println("2л SLA done");
        SLA sla3 = slaService.getSla("3");
        System.out.println("3л SLA done");
        SLA slac = slaService.getSla("c");
        System.out.println("Chats SLA done");

        sla2 = countService.getCount("2", sla2);
        System.out.println("2л count done");
        sla3 = countService.getCount("3", sla3);
        System.out.println("3л count done");
        slac = countService.getCount("c", slac);
        System.out.println("Chats count done");

        System.out.println(sla2);
        System.out.println(sla3);
        System.out.println(slac);

//        CountController controller = new CountController();
//        String rez = controller.getCount("c");
//        File file = new File("D:\\JavaCoding\\DataLensImporter\\result.txt");
//        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
//            writer.append(rez);
//        }

    }
}
