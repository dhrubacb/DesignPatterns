package main.java.gof.structural.facade.workaround.with.facade;

import java.time.LocalDateTime;

public class EmployeeRegisterService {
    private boolean isPresent = false;

    public void giveAttendance(String id) {
        // Attendance creation
        isPresent = true;
        IO.println("Employee " + id + " just punched on + " + LocalDateTime.now());
    }

    public boolean hasAttendance(String id) {
        return isPresent;
    }
}
