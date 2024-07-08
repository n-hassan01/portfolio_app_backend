package com.middlewareit.models;

import java.io.Serializable;

public class HeroCompositeKey implements Serializable {

//	Reasons for Implementing Serializable:
//		1. JPA Requirement for Composite Keys: JPA requires that composite key classes implement Serializable. 
//		This is because the composite key must be serializable to be used as a primary key in a JPA entity.
//
//		2. Persistence and Deserialization: When JPA entities are saved to a database or transmitted over a network, 
//		they often need to be serialized and deserialized. 
//		Implementing Serializable ensures that the composite key can be correctly serialized and deserialized during these operations.

	private static final long serialVersionUID = 1L;

//	The serialVersionUID is a unique identifier for Serializable classes. It is used during the deserialization process 
//	to ensure that a loaded class corresponds exactly to a serialized object. 
//	If the class does not match (e.g., if the class definition has changed), an InvalidClassException is thrown.
//	Although it is not strictly required to declare a serialVersionUID, it is good practice to do so. 
//	If you don't declare it, the Java runtime will generate one automatically based on various aspects of the class. 
//	However, this can lead to unexpected InvalidClassException errors if the class definition changes, even slightly.

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
