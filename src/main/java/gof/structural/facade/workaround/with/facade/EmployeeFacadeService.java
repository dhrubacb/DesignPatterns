package facade.workaround.with.facade;

import main.java.gof.structural.facade.workaround.with.facade.EmployeeRegisterService;
import main.java.gof.structural.facade.workaround.with.facade.EmployeeService;

public class EmployeeFacadeService {
    EmployeeService employeeService = new EmployeeService();
    EmployeeRegisterService employeeRegisterService = new EmployeeRegisterService();

    public void attend(String id) {
        IO.println("Giving Attendance....");
        if (employeeService.isValidEmployee(id)) {
            employeeRegisterService.giveAttendance("id");
            IO.println("Done Attendance....");
            return;
        }
        IO.println("Not Valid Employee");
    }

    public void giveBonus(String id) {
        if (employeeRegisterService.hasAttendance(id)) {
            employeeService.giveBonus(id);
            IO.println("Bonus given!");
            return;
        }
        IO.println("Employee Not Available");
    }
}
