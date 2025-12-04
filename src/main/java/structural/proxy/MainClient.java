package main.java.structural.proxy;

import main.java.structural.proxy.service.DataService;
import main.java.structural.proxy.service.SecurityProxy;
import main.java.structural.proxy.service.SensetiveDataService;

public class MainClient {
    static void main() {

        DataService dataService = new SecurityProxy("ADMIN");
        dataService.editData("New Data");
        dataService = new SecurityProxy("User");
        dataService.editData("Wrong role");
    }
}
