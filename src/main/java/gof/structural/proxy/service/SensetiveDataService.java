package main.java.gof.structural.proxy.service;

public final class SensetiveDataService implements DataService {
    SensetiveDataService() {
        this.data = "Init Data";
    }

    private String data;

    @Override
    public String loadData() {
        IO.println("Data: " + this.data);
        return data;
    }

    @Override
    public void editData(String data) {
        this.data = data;
        IO.println("Data Updated to: " + data);
    }
}
