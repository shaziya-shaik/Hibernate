package com.project.MappingRelationTheory;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int Roll_no;
	private String name;
	private int marks;
	//@OneToOne
	//private Laptop laptop;
	//@OneToMany(mappedBy="student")
	@ManyToMany(mappedBy="student")
	private List<Laptop> laptop=new ArrayList<Laptop>();
	@Override
	public String toString() {
		return "Student [Roll_no=" + Roll_no + ", name=" + name + ", marks=" + marks + ", laptop=" + laptop + "]";
	}
	/*public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}*/
	public int getRoll_no() {
		return Roll_no;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public void setRoll_no(int roll_no) {
		Roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

}
