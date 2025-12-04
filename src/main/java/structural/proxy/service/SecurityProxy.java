package main.java.structural.proxy.service;

public non-sealed class SecurityProxy implements DataService {
    private final DataService dataService;
    private final String role;

    public SecurityProxy(String role) {
        this.dataService = DataService.getInstance();
        this.role = role;
    }

    @Override
    public String loadData() {
        return dataService.loadData();
    }

    @Override
    public void editData(String data) {
        if (this.role.equals("ADMIN")) {
            dataService.editData(data);
        } else {
            IO.println("Not allowed to edit data with role: " + this.role);
        }
    }
}
