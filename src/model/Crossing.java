package model;

import model.road.Line;
import model.road.Road;

import java.util.List;


public class Crossing {
    private List<Crossing> neighbourCrossings;
    private List<Road> roads;
	public void addLine(Line line){}
    public List<Road> getAllRoads(){
        return roads;
    }

    public List<Crossing> getNeighbourCrossings() {
        return neighbourCrossings;
    }

    public List<Road> getRoads() {
        return roads;
    }

    public void setNeighbourCrossings(List<Crossing> neighbourCrossings) {
        this.neighbourCrossings = neighbourCrossings;
    }

    public void setRoads(List<Road> roads) {
        this.roads = roads;
    }
}