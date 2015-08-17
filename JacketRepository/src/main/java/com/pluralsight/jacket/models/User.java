package com.pluralsight.jacket.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	private int Id;
	private String Name;
	private String EMail;	
	private String Password;

	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEMail() {
		return EMail;
	}
	public void setEMail(String eMail) {
		EMail = eMail;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	 @Id
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
}
