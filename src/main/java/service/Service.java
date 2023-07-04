package service;

import controller.CountController;
import controller.SlaController;

public interface Service {
    SlaController slaController = new SlaController();
    CountController countController = new CountController();
    JSONHandler jsonHandler = new JSONHandler();
}
