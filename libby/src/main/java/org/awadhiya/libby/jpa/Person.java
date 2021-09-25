package org.awadhiya.libby.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name = "person_id")
private int id;
@Column(name="f_name")
private String firstName;
private String mi;
@Column(name="l_name")
private String lastName;
private String prefix;
private String suffix;
private String gender;

protected Person() {}

public Person(String firstName, String mi, String lastName) {
	super();
	this.firstName = firstName;
	this.mi = mi;
	this.lastName = lastName;
}

public Person(String firstName, String mi, String lastName, String gender) {
	this(firstName, mi, lastName);
	this.gender = gender;
}

public int getId() {
	return id;
}

public String getFirstName() {
	return firstName;
}

public String getMi() {
	return mi;
}

public String getLastName() {
	return lastName;
}

public String getPrefix() {
	return prefix;
}

public String getSuffix() {
	return suffix;
}

public String getGender() {
	return gender;
}

@Override
public String toString() {
	return getFirstName()+" "+getLastName();
}



}
