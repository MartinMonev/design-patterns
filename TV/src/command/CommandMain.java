package command;

public class CommandMain {

	public static void main(String[] args) {

		RemoteControl remoteController = new RemoteControl();
		TV tv = new TV();
		Command TVOnCommand = new TVOnCommand(tv);
		Command TVOffCommand = new TVOffCommand(tv);
		
		remoteController.setCommand(TVOnCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(TVOffCommand);
		remoteController.pressButton();

	}

}
