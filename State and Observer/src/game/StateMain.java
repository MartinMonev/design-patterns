package game;

public class StateMain {

	public static void main(String[] args) {

		Context horse = new Context("Shadowmare");
		Context cow = new Context("Cow King");
		
		IdleState idleState = new IdleState();
		EatingState eatingState = new EatingState();
		SleepingState sleepingState = new SleepingState();
		
		idleState.applyState(horse);
		eatingState.applyState(horse);
		sleepingState.applyState(horse);
		idleState.applyState(cow);
		eatingState.applyState(cow);
		sleepingState.applyState(cow);
		
		State horseState = horse.getState();
		State cowState = cow.getState();
		String currentState = horseState.getStateName() + cow.getState();	
		System.out.println("currentState: " + currentState);
			
	}

}
