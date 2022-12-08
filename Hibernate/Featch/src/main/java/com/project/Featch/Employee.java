package com.project.Featch;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	private int Eid;
	private String EName;
	@OneToMany(mappedBy="employee",fetch=FetchType.EAGER)
	private List<Laptop> laptop=new ArrayList<Laptop>();
	/*public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}*/
	public int getEid() {
		return Eid;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", EName=" + EName + "]";
	}

}
