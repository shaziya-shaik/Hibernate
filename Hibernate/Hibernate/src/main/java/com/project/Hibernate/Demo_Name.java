package com.project.Hibernate;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class Demo_Name {
	private String fName;
	private String lName;
	private String mName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	
	@Override
	public String toString() {
		return "Demo_Name [fName=" + fName + ", lName=" + lName + ", mName=" + mName + "]";
	}

}
