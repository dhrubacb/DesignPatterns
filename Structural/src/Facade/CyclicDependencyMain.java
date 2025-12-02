package Facade;

import Facade.cyclic.dependency.example.EmployeeRegisterService;
import Facade.cyclic.dependency.example.EmployeeService;
import Facade.workaround.with.facade.EmployeeFacadeService;

import java.util.concurrent.CountDownLatch;

public class CyclicDependencyMain {
    void main() throws InterruptedException {
        CountDownLatch lock = new CountDownLatch(1);
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
