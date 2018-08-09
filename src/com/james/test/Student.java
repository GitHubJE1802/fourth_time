package com.james.test;

public class Student {

	private int sid;
	private String name;
	private int age;
	private double score;
	public Student() {
		super();
	}
	
	
	public Student(int sid, String name, int age, double score) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.score = score;
	}


	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	
	

}
