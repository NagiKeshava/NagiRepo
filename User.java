package com.niit.shoppingcart.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//Need to create singleton instance of this Class

@Entity// to map the data base table
@Table(name="user")
@Component

//@table(name="user")//if the table name and domain class name is different
//context .scan("com.niit")
public class User {
	
private String id;
private String name;
private String password;
private String role;
private String contact;


public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}

@Min(5)
@Max(15)


public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}


	




}
