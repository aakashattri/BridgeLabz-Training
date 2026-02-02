

import java.util.*;

public class Program {
	public static List<CreatorStats>engagementBoard=new ArrayList<>();
	
	public void registerCreator(CreatorStats record) {
		if(engagementBoard.contains(record)) {
			System.out.println("Already Present");
		}
		else {
			engagementBoard.add(record);
			System.out.println("Creator registered Successfully");
		}
	}
	
	public Map<String,Integer> getTopPostCounts(List<CreatorStats>records,double likeThreshold){
		HashMap<String,Integer> map = new HashMap<>() ; 
		for(CreatorStats c : records) {

		double[] wl = c.weeklyLikes ; 
		int cnt = 0 ; 
		
		for(double num : wl ) {
			if(num >= likeThreshold) {
				cnt++;
			}
		}
		
		map.put(c.creatorName, cnt) ; 
		
		}
		return map ; 
	}
	public double calculateAverageLikes(List<CreatorStats> records) {
	    return records.stream()
	            .flatMapToDouble(c -> Arrays.stream(c.getWeeklyLikes()))
	            .average().orElse(0);
	}
	public static void main(String[] args) {
		Program program=new Program();
		CreatorStats anurag=new CreatorStats("Anurag",new double[]{65,64,34,23,65,200});
		CreatorStats aakash=new CreatorStats("Aakash",new double[]{100,5668,412,79,121,456});
		CreatorStats aditya=new CreatorStats("Aditya",new double[]{8950,64,3456,231,6525,2500});
		CreatorStats prashant=new CreatorStats("prashant",new double[]{6589,6144,3254,223,265,58200});
		
		program.registerCreator(anurag);
		program.registerCreator(aakash);
		program.registerCreator(aditya);
		program.registerCreator(prashant);
		
		
		System.out.println(program.getTopPostCounts(engagementBoard,5000.0));
		
		System.out.println("average Likes per creator: " +program.calculateAverageLikes(engagementBoard));
		
		
		
	}
}
