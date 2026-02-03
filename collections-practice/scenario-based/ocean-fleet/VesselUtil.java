

import java.util.*;
import java.util.stream.Collectors;


public class VesselUtil {
	private List<Vessel>vesselList=new ArrayList<>();

	public List<Vessel> getVesselList() {
		return vesselList;
	}

	public void setVesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}
	
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	public Vessel getVesselById(String vesselId) {
		for(Vessel v:getVesselList()){
			if(v.getVesselId().equalsIgnoreCase(vesselId)) {
				return v;
			}
		}
		return null;
	}
	public List<Vessel> getHighPerformanceVessels(){
		double maxSpeed=getVesselList().stream().mapToDouble(Vessel::getAverageSpeed).max().orElse(0);
		
		return getVesselList().stream().filter(v->v.getAverageSpeed()>=maxSpeed).collect(Collectors.toList());
		
	}
}
