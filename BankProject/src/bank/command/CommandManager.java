package bank.command;

public class CommandManager{

	private List<Command> commandList=new ArrayList();
	private int lastCommand=-1;

	public void executeCommand(Command command1){
		lastCommand++;
		commandList.add(lastCommand,command1);
		command1.execute();
	}
	public void undo(){
		commandList.get(lastCommand).undo();
		commandList.remove(lastCommand)
		lastCommand--;
	}
	public void redo(){
		commandList.get(lastCommand+1).execute();
		lastCommand++;
	}

}