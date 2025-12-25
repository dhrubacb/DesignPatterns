package main.java.gof.structural.proxy.service;

public sealed interface DataService permits SecurityProxy, SensetiveDataService {
    String loadData();

    void editData(String data);

    static DataService getInstance() {
        return new SensetiveDataService();
    }
}
