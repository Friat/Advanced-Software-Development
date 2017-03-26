package bank.command;

public class Withdraw implements Command{
	Account act;
	double amount;

	public Withdraw(Account act,double amount){
		act=this.act;
		amount=this.amount;
	}

	public void execute(){
		act.withdraw(amount);
	}
	
	public void undo(){
		act.deposit(amount);
	}
}