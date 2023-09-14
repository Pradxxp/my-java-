package Bank;

public class Account {
	public int bal;
	public int accno;
	void dispBal() {
		System.out.println("Account number : "+accno);
		System.out.println("Balance : "+bal);
	}
    synchronized void deposit(int amt) {
    	bal = bal + amt;
    	System.out.println(amt+" Deposited");
    	dispBal();
    }
    synchronized void withdraw(int amt) {
    	bal = bal - amt;
    	System.out.println(amt+" withdrawn");
    	dispBal();
    }
}
class TransactionDeposit implements Runnable{
	int amt;
	Account accX;
	TransactionDeposit(Account x , int amt){
		accX = x;
		this.amt=amt;
		new Thread(this).start();
	}
	public void run() {
		accX.deposit(amt);
	}
}

class TransactionWithdraw implements Runnable{
	int amt;
	Account accY;
	TransactionWithdraw(Account y , int amt){
		accY = y;
		this.amt=amt;
		new Thread(this).start();
	}
	public void run() {
		accY.withdraw(amt);
	}
}

class Demo {
	public static void main(String[] args) {
		Account ABC = new Account();
		ABC.bal=1000;
		ABC.accno=108;
		TransactionDeposit t1 = new TransactionDeposit(ABC,500);
		TransactionWithdraw t2 = new TransactionWithdraw(ABC,900);
		
		
	}
}