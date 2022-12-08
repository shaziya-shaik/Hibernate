package com.project.HQL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
	@Id
	int Sid;
	String SName;
	int SMarks;
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", SName=" + SName + ", SMarks=" + SMarks + "]";
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public int getSMarks() {
		return SMarks;
	}
	public void setSMarks(int sMarks) {
		SMarks = sMarks;
	}

}
