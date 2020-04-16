package com.nttdata.Model;




import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;

public class User {
	  @NotNull
	  @Size(min = 1, message = "You can't leave this empty.")
	  private String Empname;
	  @NotNull
	  
	  private int EmpId;
	  @NotNull
	  
	  private int Empage;
	  @NotNull
	  @Size(min = 1, message = "You can't leave this empty.")
	  private String EmpAdd;
	  @NotNull
	  
	  private float Empsal;
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public int getEmpage() {
		return Empage;
	}
	public void setEmpage(int empage) {
		Empage = empage;
	}
	public String getEmpAdd() {
		return EmpAdd;
	}
	public void setEmpAdd(String empAdd) {
		EmpAdd = empAdd;
	}
	public float getEmpsal() {
		return Empsal;
	}
	public void setEmpsal(float empsal) {
		Empsal = empsal;
	}
	  

	  
	 
	  

	  

	  
}
