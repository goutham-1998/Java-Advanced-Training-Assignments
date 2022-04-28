package com.llemp;

import java.util.Vector;

public class TestEmployee {
	private static final Employee[] v = null;
	public static void main(String[] args) {
		Vector<Employee> v= addInput();
		display(v);
	}
	private static Vector<Employee> addInput() {
		
		return null;
	}
	private static void display(Vector<Employee> v) {
		
	}
	
	public static Vector<Employee> main1() {
		
		Employee e1=new Employee(101, "Goutham", "Gummadipudi");
		Employee e2=new Employee(102, "Sanjana", "Dundigalla");
		Employee e3=new Employee(103, "Asra", "Mohmmad");
		Vector<Employee> v=new Vector<Employee>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return v;
		
	}
	public static void main2(String[] args) {
		
		for (Employee e :v) {
			System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
			
		}
	}
}