package Facade.workaround.with.facade;

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
