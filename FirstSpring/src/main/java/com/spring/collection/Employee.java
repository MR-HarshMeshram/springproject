package com.spring.collection;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Employee {
	private String Name;
	private List<String> Phones;
	private Set<String> Address;
	private Map<String,String> Languages;

	public static void main(String[] args) {
	
	}

	public String getName() {
		return Name;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> languages) {
		super();
		Name = name;
		Phones = phones;
		Address = address;
		Languages = languages;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<String> getPhones() {
		return Phones;
	}

	public void setPhones(List<String> phones) {
		Phones = phones;
	}

	public Set<String> getAddress() {
		return Address;
	}

	public void setAddress(Set<String> address) {
		Address = address;
	}

	public Map<String, String> getLanguages() {
		return Languages;
	}

	public void setLanguages(Map<String, String> languages) {
		Languages = languages;
	}

}
