package com.ty;

import java.util.List;

public class Student {
	private String name;
	private List<String> subjects;

	public Student(String name, List<String> subjects) {
		super();
		this.name = name;
		this.subjects = subjects;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("============Subjects==========");
		for (String subject : subjects) {
			System.out.println(subject);
		}
	}
}
