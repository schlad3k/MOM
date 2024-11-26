package com.example.demo.model;

public class Party {
	
	private String partyID;
	private int amountVotes;

	/**
	 * Constructor
	 */
	public Party(String partyID, int amountVotes) {
		this.amountVotes = amountVotes;
		this.partyID = partyID;
	}
	
	/**
	 * Setter and Getter Methods
	 */
	public String getPartyID() {
		return partyID;
	}

	public void setPartyID(String partyID) {
		this.partyID = partyID;
	}

	public int getAmountVotes() {
		return amountVotes;
	}

	public void setWarehouseName(int amountVotes) {
		this.amountVotes = amountVotes;
	}

	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Party: ID = %s, Votes = %s", partyID, amountVotes);
		return info;
	}
}
