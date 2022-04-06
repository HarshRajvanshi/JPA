package com;
import java.util.List;

public class Attendance {
	private boolean present;
	private Attendance() {
		present=true;
	}
	
	
	
	public static Attendance defaultInstance=new Attendance();
	public static Attendance getDefaultInstance() {
		return defaultInstance;
	}

	public static void setDefaultInstance(Attendance defaultInstance) {
		Attendance.defaultInstance = defaultInstance;
	}

	public boolean isPresent() {
		return present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}
	
	
}
