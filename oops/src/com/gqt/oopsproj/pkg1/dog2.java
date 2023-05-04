package com.gqt.oopsproj.pkg1;
//solution to shadowing problem:
//The usage of this keyword with instance variables will
//help the complier to recognize the instance and local variables.
//The variables with this keyword associated is the instance variables.
//Instance variables are also called as object variables as they will be getting memories along with object. {
	public class dog 2{
		private String name;
		private int cost;
		private int age;
		private String color;
		private String breed;
		//general setters and getters
		void setData(String name,int cost,int age,String color,String breed) {
			this.name=name;
			this.cost=cost;
			this.age=age;
			this.color=color;
			this.breed=breed;//shadowing problem
		}
		void getData() {
			System.out.println(name);
			System.out.println(cost);
			System.out.println(age);
			System.out.println(color);
			System.out.println(breed);
		}

	}
	public class Code2 {
		public static void main(String[] args) {
			dog2 d1=new dog2();
			d1.setData("be",5,5,"blue","bg" );
			d1.getData();
		}
	}

}
