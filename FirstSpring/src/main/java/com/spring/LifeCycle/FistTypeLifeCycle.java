package com.spring.LifeCycle;

public class FistTypeLifeCycle {
	private String Value;

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}
	public void init() {
		System.out.println(" This is the init() Method ");
	}
	public void destroy() {
        System.out.println("This is the destroy() Method");
    }

	@Override
	public String toString() {
		return "FistTypeLifeCycle [Value=" + Value + "]";
	}

}
