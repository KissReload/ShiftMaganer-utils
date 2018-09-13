package com.kiss.shifts.utils;

import java.util.LinkedList;
import java.util.List;

public class ShiftWorker extends Person {

	private List<Shift> shifts;
	
	
	public ShiftWorker(){
		super();
		shifts = new LinkedList<Shift>();
	}
	
	public ShiftWorker(String name){
		super(name);
		shifts = new LinkedList<Shift>();
	}
	
	public ShiftWorker(String name, List<Shift> shifts){
		super(name);
		this.shifts = shifts;
	}

	public List<Shift> getShifts() {
		return shifts;
	}

	public void setShifts(List<Shift> shifts) {
		this.shifts = shifts;
	}
	
	
}
