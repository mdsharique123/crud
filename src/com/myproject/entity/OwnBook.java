package com.myproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="booktrain")
public class OwnBook {
	

	@Id
	
	@Column(name="bookid")
	private int bookid;
	
	@Column(name="trainname")
	private String trainname;
	
	@Column(name="passengername")
	private String passengername;
	
	@Column(name="passengercontactnumber")
	private String passengercontactnumber;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="passsengerage")
	private String passsengerage;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTrainname() {
		return trainname;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}

	public String getPassengername() {
		return passengername;
	}

	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}

	public String getPassengercontactnumber() {
		return passengercontactnumber;
	}

	public void setPassengercontactnumber(String passengercontactnumber) {
		this.passengercontactnumber = passengercontactnumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPasssengerage() {
		return passsengerage;
	}

	public void setPasssengerage(String passsengerage) {
		this.passsengerage = passsengerage;
	}

	@Override
	public String toString() {
		return "OwnBook [bookid=" + bookid + ", trainname=" + trainname + ", passengername=" + passengername
				+ ", passengercontactnumber=" + passengercontactnumber + ", gender=" + gender + ", passsengerage="
				+ passsengerage + "]";
	}
	
	

}
