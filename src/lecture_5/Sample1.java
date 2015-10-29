package lecture_5;

abstract class Box {
	int h;
	int w;
	int d;
	double m;
	
	public Box(int h, int w, int d) {
		this.h = h;
		this.w = w;
		this.d = d;
	}
	
	int value() {
		return h * w * d;
	}
	
	abstract double area();
	
	void print() {
		System.out.println("Box : value = " + value());
	}
}

class RealBox extends Box {
	double m;

	public RealBox(int h, int w, int d, double m) {
		super(h, w, d);
		this.m = m;
	}
	
	int value() {
		System.out.println("call value in RealBox");
		return 0;
	}
	
	double ro() {
		return m / value();
	}
}


public class Sample1 {

	
	static void fun(Box arr[]) {
		for(int i = 0; i < arr.length; i++)
			arr[i].value();
	}
	
	public static void main(String[] args) {
		Box b = new RealBox(1,2,3,4);
		b.print();
		b.value();
		
		boolean f = b instanceof RealBox; 
		if (b instanceof RealBox) {	
			RealBox rb = (RealBox)b;
			
		}
		
		Object obj = new String();
		//Box box = new Box(1,2,3);
		//b1.print();
		//RealBox rb = new RealBox(1,2,3,4);
		//rb.print();
		
		//RealBox b = new RealBox(1,2,3,4);
		//System.out.println(b.ro());
		//b.value();
	}

}
