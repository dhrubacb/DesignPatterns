package main.java.gof.behavioral.state;

public class TrafficLight {
    private LightState currentState;

    public TrafficLight(LightState initialState) {
        this.currentState = initialState;
    }

    public void setCurrentState(LightState newState) {
        this.currentState = newState;
    }

    public void change() {
        currentState.changeState(this);
    }

}
