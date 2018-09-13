package com.kiss.shifts.utils;

import java.util.Calendar;

public class Shift {
	
	private Calendar date;
	private ShiftsType type;
	
	
	
	public Shift() {
		super();
	}
	
	public Shift(Calendar date, ShiftsType type) {
		super();
		this.date = date;
		this.type = type;
	}


	
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public ShiftsType getType() {
		return type;
	}
	public void setType(ShiftsType type) {
		this.type = type;
	}
	
	
	
}
