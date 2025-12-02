package main.java.structural.facade.cyclic.dependency.example;

import java.util.random.RandomGenerator;

public class EmployeeService {
    private final EmployeeRegisterService employeeRegisterService = new EmployeeRegisterService();
    public void giveBonus(String id) {
        if (employeeRegisterService.hasAttendance(id)) {
            // Give bonus logic if employee present
            IO.println("Gave $10 bonus to " + id);
        }
    }

    public boolean isValidEmployee(String id) {
        return RandomGenerator.getDefault().nextBoolean();
    }
}
