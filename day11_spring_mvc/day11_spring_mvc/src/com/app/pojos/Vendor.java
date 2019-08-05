package com.app.pojos;

public class Vendor {
	private Integer id;
	private String name,email,password;
	private String city,phoneNo,role;
	public Vendor() {
		// TODO Auto-generated constructor stub
	}
	
	public Vendor(Integer id, String name, String email, String password, String city, String phoneNo,String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.phoneNo = phoneNo;
		this.role=role;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", city=" + city
				+ ", phoneNo=" + phoneNo + "]";
	}
	
	

}
