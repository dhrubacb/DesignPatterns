package main.java.behavioral.state;

public class Main {
    static void main() {
        TrafficLight trafficLight = new TrafficLight(new RedLight());
        trafficLight.change(); // Red to Green
        trafficLight.change(); // Green to Yellow
        trafficLight.change(); // Yellow to Red
    }
}
