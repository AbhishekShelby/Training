package com.infinite.jsfExamples;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List ;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped 

public class EmployDAO implements Serializable{
	
	public List<Employ> showEmploy(){
		List<Employ> employList= new ArrayList<Employ>();
		employList.add(new Employ(1 , "Abhishek", "Java", "Developer" ,188.20));
		employList.add(new Employ(2 , "Abhi", "Java", "Developer" ,18845.20));
		employList.add(new Employ(3 , "Shek", "Java", "Developer" ,18825.20));
		employList.add(new Employ(4 , "Abhk", "Java", "Developer" ,18656544.20));
	return employList;
	}


}
