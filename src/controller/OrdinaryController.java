package controller;

import model.enums.RoadOrientation;
import model.road.Line;
import model.road.Road;
import model.trafficLights.TrafficLight;

import java.util.List;
import controller.CrossingController;
import model.road.Line;
import model.road.Road;


public class OrdinaryController extends CrossingController {

	public OrdinaryController(){}
	public void makeQueue(){

	}

    @Override
    public void setConflictedLightsToAllLights() {
        for(Road oneRoad: controlledCrossing.getAllRoads()) {
            for (Road anotherRoad : controlledCrossing.getAllRoads()) {
                if (!oneRoad.isOppositeRoad(anotherRoad) && oneRoad.getOrientation() != anotherRoad.getOrientation()) {
                    for (Line line : oneRoad.getLines()) {
                        for (Line anotherLine : anotherRoad.getLines()) {
                            line.addConflictLight(anotherLine.getTrafficLight());
                        }
                    }
                }
                else {
                    for (Line line : oneRoad.getLines()) {
                            line.addConflictLight(anotherRoad.getCrosswalk().getPedLight());
                    }
                }
            }
        }
    }
    public void playCrossing(){

    }
}