
public class TaxiService implements java8.scenario_based.smartcity_transport_and_service_management.TransportService {
	private String route;
    private double fare;
    private int departureTime;

    public TaxiService(String route,double fare,int departureTime) {
        this.route=route;
        this.fare=fare;
        this.departureTime=departureTime;
    }

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Taxi";
	}

	@Override
	public double getFare() {
		// TODO Auto-generated method stub
		return fare;
	}

	@Override
	public String getRoute() {
		// TODO Auto-generated method stub
		return route;
	}

	@Override
	public int getDepartureTime() {
		// TODO Auto-generated method stub
		return departureTime;
	}

}
