package main.java.gof.structural.proxy;

import main.java.gof.structural.proxy.service.DataService;
import main.java.gof.structural.proxy.service.SecurityProxy;

public class MainClient {
    static void main() {

        DataService dataService = new SecurityProxy("ADMIN");
        dataService.editData("New Data");
        dataService = new SecurityProxy("User");
        dataService.editData("Wrong role");
    }
}
