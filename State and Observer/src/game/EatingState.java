package game;

public class EatingState implements State 
{

	private String eatingName = "EATING_STATE";
	
	public void applyState(Context context) 
	{
		context.setState(this);
	}

	public String getStateName() 
	{
		return this.eatingName;
	}
}
