package main.java.gof.structural.facade.workaround.with.facade;

import java.util.random.RandomGenerator;

public class EmployeeService {
    public void giveBonus(String id) {
        // Give bonus logic if employee present
        IO.println("Gave $10 bonus to " + id);
    }

    public boolean isValidEmployee(String id) {
        return RandomGenerator.getDefault().nextBoolean();
    }
}
