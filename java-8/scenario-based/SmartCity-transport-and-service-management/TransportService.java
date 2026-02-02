package java8.scenario_based.smartcity_transport_and_service_management;

public interface TransportService {
	String getName();
    double getFare();
    String getRoute();
    int getDepartureTime();

    default void printServiceDetails() {
        System.out.println(getName()+" | Route: " +getRoute()+" | Fare: "+getFare());
    }
}
