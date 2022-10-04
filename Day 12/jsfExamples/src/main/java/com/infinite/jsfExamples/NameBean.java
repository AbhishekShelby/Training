package com.infinite.jsfExamples;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


	@ManagedBean
	@SessionScoped 
	public class NameBean implements Serializable{
		private String FirstName ;
		private String LastName ;
		public String getFIrstName() {
			return FirstName;
		}
		public void setFIrstName(String firstName) {
			FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		
		
		
		
	}

