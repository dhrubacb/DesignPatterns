package facade;

import facade.workaround.with.facade.EmployeeFacadeService;
import main.java.gof.structural.facade.cyclic.dependency.example.EmployeeRegisterService;
import main.java.gof.structural.facade.cyclic.dependency.example.EmployeeService;

public class CyclicDependencyMain {
    void main() throws InterruptedException {
        // This code will generate StackOverflow due to dependency on each other
        try {
            EmployeeRegisterService employeeRegisterService = new EmployeeRegisterService();
            employeeRegisterService.giveAttendance("id");
            EmployeeService employeeService = new EmployeeService();
            employeeService.giveBonus("id");
        } catch (Error ee) {
            IO.println("Stack Overflow Error");
        } finally {
            // This should work
            EmployeeFacadeService employeeFacadeService = new EmployeeFacadeService();
            employeeFacadeService.attend("id");
            employeeFacadeService.giveBonus("id");
        }
    }
}
