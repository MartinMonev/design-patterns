package game;

public class SleepingState implements State 
{

	private String sleepingName = "SlEEPING_STATE";
	
	public void applyState(Context context) 
	{
		context.setState(this);
	}
	
	public String getStateName() 
	{
		return this.sleepingName;
	}
}
