package com.gqt.oopsproj.pkg1;
//shadowing problem:
//it is a scenario where the complier is confused in differentating between instance 
//and local variables.this result in the default values being retained in the instance variables.
public class dog1{
	private String name;
	private int cost;
	private int age;
	private String color;
	private String breed;
	//general setters and getters
	void setData(String name,int cost,int age,String color,String breed) {
		name=name;
		cost=cost;
		age=age;
		color=color;
		breed=breed;//shadowing problem
	}
	void getData() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(color);
		System.out.println(breed);
	}

}
public class Code1   {
	public static void main(String[] args) {
		dog2 d1=new dog2();
		d1.setData("Rocky", 5000, 5, "white","GR");
		d1.getData();
	}
}
