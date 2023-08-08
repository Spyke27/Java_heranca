package entities;

public class Account {

	private Integer account;
	private String holder;
	private Double balance;
	
	public Account() {}

	public Account(Integer account, String holder, Double balance) {
		this.account = account;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	
	
	
	
}
