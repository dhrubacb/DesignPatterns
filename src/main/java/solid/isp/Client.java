package main.java.solid.isp;

import main.java.solid.isp.violation.BasicPrinter;

/*
Interface Segregation Principle States that NO CLIENT should be forced to depend on method that it does not use.
In Simpler term large interfaces should be split into smaller, more specific ones. It is better to have many specific interface
than one fat general purpose interface.
 */
public class Client {
    static void main() {
        BasicPrinter basicPrinter = new BasicPrinter();
        try {
            basicPrinter.scan();// Violation
        } catch (Exception e){
            e.printStackTrace();
        }

        BasicScanner basicScanner = new BasicScanner();
        basicScanner.scan(); // Fix
    }
}
