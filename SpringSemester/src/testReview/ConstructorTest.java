package testReview;

public class ConstructorTest /*Item*/{

	private String description;
	private boolean purchased;
	
	public ConstructorTest /*Item*/ (String d) {
		this.description = d;
		this.purchased = false; 
	}
	
	public void setPurchase(boolean b){
		this.purchased = b;
	}

	public boolean isPurchased() {
		return purchased;
	}

	public String getDescription() {
		return description;
	}

}
