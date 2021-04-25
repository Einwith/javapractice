package javapractice;

public class RyanAndMonicaJob implements Runnable{
	private BankAccount account = new BankAccount();
	
	public static void main(String[] args) {
		RyanAndMonicaJob job = new RyanAndMonicaJob();
		Thread RyanT = new Thread(job);
		Thread MonicaT = new Thread(job);
		
		RyanT.setName("Ryan");
		MonicaT.setName("Monica");
		
		RyanT.start();
		MonicaT.start();
	}
	public void run() {
		for(int x = 0; x <10; x++) {
			makeWithdrawal(10);
			if(account.getBalance() < 0) {
				System.out.println("Overdrawn!");
			}
		}
	}
	
	synchronized private void makeWithdrawal (int amount)
	{
		if(account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw");
			try {
				System.out.println(Thread.currentThread().getName() + " is about to sleep");
				Thread.sleep(100);
			} catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " woke up.");
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		}
		else {
			System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
		}
	}

}

class BankAccount {
	private int balance = 100;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		balance = balance - amount;
	}
}