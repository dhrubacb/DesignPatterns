package main.java.gof.behavioral.state;

public class YellowLight implements LightState {
    @Override
    public void changeState(TrafficLight trafficLight) {
        IO.println("Light is YELLOW. Prepare to stop! -> Changing to RED");
        trafficLight.setCurrentState(new RedLight());
    }
}
