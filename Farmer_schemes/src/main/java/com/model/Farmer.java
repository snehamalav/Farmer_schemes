package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Farmer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int f_id;
	
	private String full_name;
	private int contact_no;
	private String email;
	private String address;
	private String city;
	private String state;
	private int pincode;
	private int land_area;
	private String land_address;
	private int land_pincode;
	private int account_no;
	private int ifsc_code;
	private int adhar_no;
	private String adhar_fname; 
	private String pan_fname ;
	private String certificate_fname ;
	private String password ;
	private String status;
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public int getContact_no() {
		return contact_no;
	}
	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getLand_area() {
		return land_area;
	}
	public void setLand_area(int land_area) {
		this.land_area = land_area;
	}
	public String getLand_address() {
		return land_address;
	}
	public void setLand_address(String land_address) {
		this.land_address = land_address;
	}
	public int getLand_pincode() {
		return land_pincode;
	}
	public void setLand_pincode(int land_pincode) {
		this.land_pincode = land_pincode;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public int getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(int ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public int getAdhar_no() {
		return adhar_no;
	}
	public void setAdhar_no(int adhar_no) {
		this.adhar_no = adhar_no;
	}
	public String getAdhar_fname() {
		return adhar_fname;
	}
	public void setAdhar_fname(String adhar_fname) {
		this.adhar_fname = adhar_fname;
	}
	public String getPan_fname() {
		return pan_fname;
	}
	public void setPan_fname(String pan_fname) {
		this.pan_fname = pan_fname;
	}
	public String getCertificate_fname() {
		return certificate_fname;
	}
	public void setCertificate_fname(String certificate_fname) {
		this.certificate_fname = certificate_fname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Farmer(int f_id, String full_name, int contact_no, String email, String address, String city, String state,
			int pincode, int land_area, String land_address, int land_pincode, int account_no, int ifsc_code,
			int adhar_no, String adhar_fname, String pan_fname, String certificate_fname, String password,
			String status) {
		super();
		this.f_id = f_id;
		this.full_name = full_name;
		this.contact_no = contact_no;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.land_area = land_area;
		this.land_address = land_address;
		this.land_pincode = land_pincode;
		this.account_no = account_no;
		this.ifsc_code = ifsc_code;
		this.adhar_no = adhar_no;
		this.adhar_fname = adhar_fname;
		this.pan_fname = pan_fname;
		this.certificate_fname = certificate_fname;
		this.password = password;
		this.status = status;
	}
	public Farmer() {
		super();
	}
	@Override
	public String toString() {
		return "Farmer [f_id=" + f_id + ", full_name=" + full_name + ", contact_no=" + contact_no + ", email=" + email
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", land_area=" + land_area + ", land_address=" + land_address + ", land_pincode=" + land_pincode
				+ ", account_no=" + account_no + ", ifsc_code=" + ifsc_code + ", adhar_no=" + adhar_no
				+ ", adhar_fname=" + adhar_fname + ", pan_fname=" + pan_fname + ", certificate_fname="
				+ certificate_fname + ", password=" + password + ", status=" + status + "]";
	}
}