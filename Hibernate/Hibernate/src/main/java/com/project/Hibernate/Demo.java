package com.project.Hibernate;


import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Hib_table")
public class Demo {
	
	@Id//primary key
	private int eid;
	//@Transient
	private Demo_Name eName;
	@Column(name="eColor")
	private String color;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Demo_Name geteName() {
		return eName;
	}

	public void seteName(Demo_Name eName) {
		this.eName = eName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Demo [eid=" + eid + ", eName=" + eName + ", color=" + color + "]";
	}

}
