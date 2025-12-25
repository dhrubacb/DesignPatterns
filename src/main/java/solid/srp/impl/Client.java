package main.java.solid.srp.impl;

public class Client {
    // Here Address and User both are distinguished from each other, So if change needed in the address, then only change address properties,
    // no need to change address object in the user.
    // So there is only single reason needed to change any object
    static void main() {
        Address address = new Address();
        address.setHouseNo("2");
        address.setPo("40160");
        User user = new User();
        user.setName("AUser");
        user.setAddress(address);
    }
}
