package model.road;

import model.enums.LineDirection;
import model.enums.RoadOrientation;

import java.util.ArrayList;
import java.util.List;


public class Road {

	private List<Line> lines;
private Crosswalk crosswalk;
    private RoadOrientation orientation;


    public Road(RoadOrientation orientation){
        this.orientation = orientation;
        lines = new ArrayList<Line>();
        addNewLine(LineDirection.STRAIGHT);
	}

    public void addNewLine(LineDirection direction){
        lines.add(new Line( direction, orientation));
    }
    public List<Line> getLines() {
        return lines;
    }
    public RoadOrientation getOrientation() {
        return orientation;
    }
    public boolean isOppositeRoad(Road road){
        return  ((orientation == RoadOrientation.NORTH && road.getOrientation() == RoadOrientation.SOUTH)
                ||
                (orientation == RoadOrientation.WEST && road.getOrientation() == RoadOrientation.EAST)
                ||
                (orientation == RoadOrientation.SOUTH && road.getOrientation() == RoadOrientation.NORTH)
                ||
                (orientation == RoadOrientation.EAST && road.getOrientation() == RoadOrientation.WEST));
    }

    public Crosswalk getCrosswalk(){
        return crosswalk;

    }
}