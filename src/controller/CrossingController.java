package controller;

import model.Crossing;
import model.trafficLights.TrafficLight;
import java.util.List;

public abstract class CrossingController {

	private List<List<TrafficLight>> queueOfLightingLights;
	protected Crossing controlledCrossing;

	public CrossingController(){}
	public void playCrossing(){}
	public void useDetector(){}
    public abstract void makeQueue();
    public abstract void setConflictedLightsToAllLights();



}