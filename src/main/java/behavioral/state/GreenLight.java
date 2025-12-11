package main.java.behavioral.state;

public class GreenLight implements LightState {
    @Override
    public void changeState(TrafficLight trafficLight) {
        IO.println("Light is GREEN. Go! -> Changing to YELLOW");
        trafficLight.setCurrentState(new YellowLight());
    }
}
