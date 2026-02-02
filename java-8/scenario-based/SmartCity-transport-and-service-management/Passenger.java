
public class Passenger {

    private String route;
    private double fare;
    private boolean peak;

    public Passenger(String route,double fare,boolean peak) {
        this.route=route;
        this.fare=fare;
        this.peak=peak;
    }

    public String getRoute() { 
    	return route; 
    	}
    public double getFare() {
    	return fare; 
    	}
    public boolean isPeak() {
    	return peak;
    	}
}
