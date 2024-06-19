package com.student;

public class student {
      
	private int id;
	private String Name;
	private String Email;
	private String ClassName;
	private String NIC;
	private String Address;
	private String DOB;
	private String Gender;
	
	
	
	public student(int id, String Name, String Email, String ClassName,String NIC,String Address,String DOB,String Gender) {
		
		this.id = id;
		this.Name = Name;
		this.Email = Email;
		this.ClassName = ClassName;
		this.NIC =NIC;
		this.Address=Address;
		this.DOB=DOB;
		this.Gender=Gender;
		
	}


	public int getid() {
		return id;
	}


	

	public String getName() {
		return Name;
	}


	

	public String getEmail() {
		return Email;
	}


	


	public String getClassName() {
		return ClassName;
	}


	

	public String getNIC() {
		return NIC;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public String DOB() {
		return DOB;
	}
	
	public String getGender() {
		return Gender;
	}


	
}
