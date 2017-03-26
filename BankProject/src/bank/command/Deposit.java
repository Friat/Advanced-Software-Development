package bank.command;

public class Deposit implements Command{
	Account act;
	double amount;

	public Deposit(Account act,double amount){
		act=this.act;
		amount=this.amount;
	}

	public void execute(){
		act.deposit(amount);
	}
	
	public void undo(){
		act.withdraw(amount);
	}
}