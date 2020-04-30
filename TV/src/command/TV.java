package command;

public class TV {
	
	private Boolean tvOn;
	
	public void switchOn() {
		System.out.println("TV is turned on");
		this.tvOn = true;
	}
	
	public void switchOff() {
		System.out.println("TV is turned off");
		this.tvOn = false;
	}
	
}
