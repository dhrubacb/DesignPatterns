package main.java.structural.facade.cyclic.dependency.example;

import java.time.LocalDateTime;

public class EmployeeRegisterService {
    private boolean isPresent = false;
    private final EmployeeService employeeService = new EmployeeService();
    public void giveAttendance(String id) {
        boolean validEmployee = employeeService.isValidEmployee(id);
        if (validEmployee) {
            // Attendance creation
            isPresent = true;
            IO.println("Employee " + id + " just punched on + " + LocalDateTime.now());
        }
    }
    public boolean hasAttendance(String id) {
        return isPresent;
    }
}
