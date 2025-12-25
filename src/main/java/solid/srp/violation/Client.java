package main.java.solid.srp.violation;

public class Client {
    static void main() {
        // Even though house no is not a part of user's intrinsic property still
        // any change in the house no will lead to change in the user
        User user = new User();
        user.setHouseNo("2");
        user.setPo("40160");
        user.setName("AUser");
    }
}
