package main.java.creational.prototype;

public class Client {
    static void main() {
        CJ cj = new CJ(100, "Black");
        CJ npcCjType = (CJ) cj.clone();
        IO.println(npcCjType.getLabel());

        Tommy tommyViceCity = new Tommy(50);
        tommyViceCity.clone();
    }
}
