
import java8.scenario_based.smartcity_transport_and_service_management.EmergencyService;
public class AmbulanceService implements java8.scenario_based.smartcity_transport_and_service_management.TransportService,EmergencyService{
	private String route;
    private double fare;
    private int departureTime;

    public AmbulanceService(String route,double fare,int departureTime) {
        this.route=route;
        this.fare=fare;
        this.departureTime=departureTime;
    }
	@Override
	public void printServiceDetails() {
		// TODO Auto-generated method stub
		System.out.println("Ambulance Service");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Ambulance";
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
