package com.app.pojos;
import javax.persistence.*;

@Entity
@Table(name="spring_hib_vendors")
public class Vendor {
	private Integer id;
	private String name,email,password;
	private String city,phoneNo,role;
	public Vendor() {
		System.out.println("in vendor constr");
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
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(length=20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length=20,unique=true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(length=20)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(length=20)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(length=10,name="ph_no",unique=true)
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Column(length=20)
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
