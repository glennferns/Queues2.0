package atm;

public class Controller {
	
	public void transaction(int pin,int cardno,int amt,BankAccount bankaccount,Machine machine,Display display){
	
		Card card=new Card(pin,cardno);
		CardReader cardreader=new CardReader(bankaccount.getPin(card.getCardNo()));
		
		if(cardreader.getPin()==-1){
			display.print("Account does not exist");
		}
		else{
		if(cardreader.checkPin(card.getPin())!=1){
			display.print("Incorrect Pin");
		}
		else{
			BankAccount current_acc=new BankAccount(bankaccount.getPin(),bankaccount.getCardno(),bankaccount.getAccno(),bankaccount.getBalance());
			
			int withdraw=amt;
			
			if(machine.check_balance()>withdraw){
			
				if(current_acc.withdraw(withdraw)==1){
					machine.dispense(withdraw);
					display.print("Transaction completed");
					bankaccount.setBalance(current_acc.checkbalance());
				}
				else
				{
					display.print("Insufficient Balance");
					display.print("Transaction Aborted");
				}
			}
			
			else{
				display.print("Insufficient Balance in the machine.");
			}
			
			
			
			display.print("Balance is :"+bankaccount.checkbalance());
			display.print("       ");
			display.print("Machine balance is :"+machine.check_balance());
			machine.check_den();
		}
		}
		
	}
		
	}
	
	
	
