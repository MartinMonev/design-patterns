package game;

public class IdleState implements State 
{

	private String idleName = "IDLE_STATE";
	
	public void applyState(Context context) 
	{
		context.setState(this);
	}
	
	public String getStateName() 
	{
		return this.idleName;
	}

}
