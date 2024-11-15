package com.spring.autowring.Annotation;
import org.springframework.beans.factory.annotation.*;

public class Students {
	@Autowired
	private Address Address;

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(com.spring.autowring.Annotation.Address address) {
		super();
		Address = address;
	}
}
