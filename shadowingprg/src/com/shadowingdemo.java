package com;

class Dog {
	private String name;
	private int cost;
	private int age;
	private String color;
	private String breed;
	
	void setData(String name,int cost,int age,String color,String breed) {
		name =name;
		cost=cost;
		age=age;
		color=color;
		breed=breed;
	}
	void getData () {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(color);
		System.out.println(breed);
	}
}
public class shadowingdemo {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.setData("rocky", 5000, 20, "black", "GR");
		d.getData();
	}

}
