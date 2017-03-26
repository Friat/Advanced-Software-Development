package bank.command;

public class TransferFunds implements Command{
	private Account actFrom;
	private Account actTo;
	private Account amount;
	private String description;

	public TransferFunds(Account actFrom, Account actTo, double amount, String description){
		actFrom=this.actFrom;
		actTo=this.actTo;
		amount=this.amount;
		description=this.description;
	}

	public void execute(){
		actFrom.transferFunds(actTo, amount, description);
	}

	public void undo(){
		actTo.transferFunds(actFrom, amount, "Reversed Transfer " + description);
	}
}