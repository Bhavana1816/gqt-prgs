package com.gqt.oopsproj.pkg1;
abstract class plane1 {
void takeoff() {
		System.out.println("plane is flying");
	}
abstract void fly();
 void land() {
	System.out.println("plane landed");
}
}
class passengerplane1 extends plane1{
@Override
	void fly() {
		System.out.println("passenger plane is fly at medium speed");
	}
}
class cargoplane1 extends plane1 {
@Override
	void fly() {
		System.out.println("cargo plne fly at high speed");
	}
}
class fighterplane1 extends plane1{
@Override
	void fly() {
		System.out.println("fighter plane fly at very low speed");
	}
}
class airport1 {
	void permitplane(plane1 p) {
		p.takeoff();
		p.fly();
		p.land();
	}
}
public class abstractclass {
	public static void main(String[] args) {
		passengerplane1 p = new passengerplane1();
		cargoplane1 c = new cargoplane1();
		fighterplane1 f = new fighterplane1();
		
		airport1 a= new airport1();
		a.permitplane(p);
		a.permitplane(c);
		a.permitplane(f);
		
	}
}
