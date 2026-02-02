import java8.scenario_based.smartcity_transport_and_service_management.TransportService;

public class MetroService implements TransportService{
	private String route;
    private double fare;
    private int departureTime;

    public MetroService(String route,double fare,int departureTime) {
        this.route=route;
        this.fare=fare;
        this.departureTime=departureTime;
    }
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Metro";
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
