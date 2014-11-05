package model.road;

import model.enums.LineDirection;
import model.enums.RoadOrientation;
import model.trafficLights.DriverLight;
import model.trafficLights.TrafficLight;



public class Line {



    private TrafficLight trafficLight;
	private RoadOrientation orientation;
	private LineDirection direction;

    public Line( LineDirection  direction, RoadOrientation orientation) {
        this.direction = direction;
        this.orientation = orientation;
        trafficLight = new DriverLight();
    }

    public void setDirection(LineDirection direction) {
        this.direction = direction;
    }

    public void setOrientation(RoadOrientation orientation) {
        this.orientation = orientation;
    }

    public LineDirection getDirection() {
        return direction;
    }

    public RoadOrientation getOrientation() {
        return orientation;
    }

    public Line(){

	}

	public void addConflictLight(TrafficLight light){
		trafficLight.addConflictLight(light);
	}
    public TrafficLight getTrafficLight() {
        return trafficLight;
    }


}