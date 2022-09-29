package com.example1;

public class PiggieBank {

	private int amount;

	public PiggieBank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PiggieBank(int amount) {
		super();
		this.amount = 50;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "PiggieBank [amount=" + amount + "]";
	}

}
