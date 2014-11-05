package model.road;


import model.trafficLights.PedLight;
public class Crosswalk {

	private PedLight pedLight;

	public Crosswalk(){

	}

    public PedLight getPedLight() {
        return pedLight;
    }

    public void setPedLight(PedLight pedLight) {
        this.pedLight = pedLight;
    }


}