package com.hcl;

public class Employee {
	
	private Employee() {
		
	}
    static Employee object;
    
	public static Employee getObject() {
		
		if (object==null) {
			object = new Employee();
		}
		return object;
		
	}
	
	public void Fun() {
	System.out.println("hello");
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.Fun();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
