package main.java.creational.builder;

public class Client {
    static void main() {
        Entity entity = new Entity.EntityBuilder().withAttribute("Good").build();
        IO.println(entity.getAttribute());
    }
}
