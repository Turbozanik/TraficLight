package model;

import java.util.List;


public class Detector {

	private int unitCounts;
        private int upcomingUnitsCount;//number of units to be added to unitsCount


	public Detector(){

	}

    public void setUpcomingUnitsCount(int upcomingUnitsCount) {
        this.upcomingUnitsCount = upcomingUnitsCount;
    }

    public void setUnitCounts(int unitCounts) {
        this.unitCounts = unitCounts;
    }

    public int getUpcomingUnitsCount() {
        return upcomingUnitsCount;
    }


	public void addUnit(List<Object> unitList){
        unitList.add(upcomingUnitsCount);
	}

	public int getUnitCounts(){
		return unitCounts;
	}
}