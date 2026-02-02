

public class CreatorStats {
	String creatorName;
	 double[] weeklyLikes;
	
	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public double[] getWeeklyLikes() {
		return weeklyLikes;
	}

	public void setWeeklyLikes(double[] weeklyLikes) {
		this.weeklyLikes = weeklyLikes;
	}

	CreatorStats(String creatorName,double[]weeklyLikes){
		this.creatorName=creatorName;
		this.weeklyLikes=weeklyLikes;
	}
	
}
