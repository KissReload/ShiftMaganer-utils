package com.kiss.shifts.utils;

/**
 * Provides all possible codes for the shift types
 * 
 * @author T.Benetton
 */
public enum ShiftsType {
	
	/**
	 * Morning shift
	 */
	M("M"),
	
	/**
	 * Afternoon shift
	 */
	P("P"),
	
	/**
	 * Night shift
	 */
	N("N"),
	
	/**
	 * Rest after a night shift
	 */
	LN("LN"),

	/**
	 * Rest
	 */
	R("R"),
	
	/**
	 * Vacation
	 */
	F("F"),
	
	/**
	 * Absent due to illness
	 */
	MAL("MAL"),
	
	/**
	 * Absent due to CDS
	 */
	CDS("CDS");
	
	
	private String symbol;
	
	
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	

	private  ShiftsType(String symbol){
		this.symbol=symbol;
	}
	
	
}
