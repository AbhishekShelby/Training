package com.infinite.jdbc;

public class Employ {
	private int empno ;
	private String name ; 
	private String dept ;
	private String design ;
	private int basic ;
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept + ", design=" + design + ", basic="
				+ basic + "]";
	}
	public Employ(int empno, String name, String dept, String design, int basic) {
		
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.design = design;
		this.basic = basic;
	}
	public Employ() {
		
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	
	
	

}
