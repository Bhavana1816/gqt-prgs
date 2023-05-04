package methodoverloding;

class calculator{
	int add(int a, int b) {
		return a+b;
	}
	float add(float a, float b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	float add(int a, float b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
}
public class methodoverloding {
	public static void main(String[] args) {
		calculator c =new calculator();
		System.out.println(c.add(10,20, 0));
		System.out.println(c.add(20.4f,30.5f));
		System.out.println(c.add(10, 20, 30));
	}
}
