package summeracceleration1;

public class StudentClass {
	private String name;
	private int id,attendance;
	private double internalMarks,externalMarks;
	
	public String getPromotionStatus() {
		if(this.attendance<85) return"DETAINED";
		return "PROMOTED";
		
	}
	public double calTotalMarks() {
		return 0.6*this.internalMarks+0.4*this.externalMarks;
	}
	public char getGraded() {
		double tm = this.calTotalMarks();
		if(this.attendance<85 ||tm<40||this.externalMarks<40) return 'f';
		if(tm>=90) return 'O';
		if(tm>=70) return 'A';
		if(tm>=50) return 'B';
		return 'C';
		
		
	}
	public void printSummary() {
		System.out.printf("Name:%s%n",this.name.toUpperCase());
		System.out.printf("id: %d%n", this.id);
		System.out.printf("Status: %s%n", this.getPromotionStatus().toUpperCase()); 
		System.out.printf("Grade:%c%n",this.getGraded());
				
	}
	

}
