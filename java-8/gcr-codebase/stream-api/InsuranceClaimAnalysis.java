

import java.util.*;
import java.util.stream.Collectors;

class Claim{
	private String type;
	private double averageClaimAmount;
	
	Claim(String type,double averageClaimAmount){
		this.type=type;
		this.averageClaimAmount=averageClaimAmount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAverageClaimAmount() {
		return averageClaimAmount;
	}

	public void setAverageClaimAmount(double averageClaimAmount) {
		this.averageClaimAmount = averageClaimAmount;
	}

	@Override
	public String toString() {
		return "Claim [type=" + type + ", averageClaimAmount=" + averageClaimAmount + "]";
	}
	
}
public final class InsuranceClaimAnalysis {
	public static void main(String[] args) {
		List<Claim>claims=Arrays.asList(
				new Claim("Health",5000000),
				new Claim("Accident",1500000),
				new Claim("Naturat Disaster",2000000),
				new Claim("fraud",200000)
				);
				
		Map<String, Double> avgClaimByType =
                claims.stream()
                        .collect(Collectors.groupingBy(Claim::getType,Collectors.averagingDouble(Claim::getAverageClaimAmount)));

        avgClaimByType.forEach((k, v) ->
                System.out.println(k + " Average Claim: " + v));
	}
}
