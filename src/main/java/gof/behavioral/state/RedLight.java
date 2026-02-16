package main.java.gof.behavioral.state;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Represents the Red Light state of a traffic light.
 * In this state, the light is red, and the next state is green.
 */
public class RedLight implements LightState {

    /**
     * Handles the state transition for the RedLight.
     * It prints the current state and transitions the traffic light to the GreenLight state.
     *
     * @param trafficLight the TrafficLight context whose state needs to be changed.
     */
    @Override
    public void changeState(TrafficLight trafficLight) {
        IO.println("Light is RED. Stop! -> Changing to GREEN...");
        trafficLight.setCurrentState(new GreenLight());
        int[][] val  = new int[2][2];
        Arrays.sort(val, Comparator.comparing(val1 -> val1[0]));
    }
}
