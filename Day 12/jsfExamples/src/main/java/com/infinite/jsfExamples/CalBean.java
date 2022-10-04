package com.infinite.jsfExamples;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


	@ManagedBean
	@SessionScoped 
	public class CalBean implements Serializable{
		private int firstNo ;
		private int secondNo ;
		public int getFirstNo() {
			return firstNo;
		}
		public void setFirstNo(int firstNo) {
			this.firstNo = firstNo;
		}
		public int getSecondNo() {
			return secondNo;
		}
		public void setSecondNo(int secondNo) {
			this.secondNo = secondNo;
		}
		
		

}
