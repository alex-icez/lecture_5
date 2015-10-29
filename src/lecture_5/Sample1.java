package lecture_5;

class Box {
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
	
	double area() {
		return 0;
	}
	

	void print() {
		System.out.println("Box : value = " + area());
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
	//	return super.value();
		return 0;
	}
	
	double ro() {
		return m / value();
	}
}


public class Sample1 {

	public static void main(String[] args) {
		Box b1 = new Box(1,2,3);
		b1.print();
		RealBox rb = new RealBox(1,2,3,4);
		rb.print();
		
		//RealBox b = new RealBox(1,2,3,4);
		//System.out.println(b.ro());
		//b.value();
	}

}
