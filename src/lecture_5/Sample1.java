package lecture_5;

class Box {
	int h;
	int w;
	int d;
	
	public Box(int h, int w, int d) {
		this.h = h;
		this.w = w;
		this.d = d;
	}
	
	int value() {
		return h * w * d;
	}
}

class RealBox extends Box {
	double m;

	public RealBox(int h, int w, int d, double m) {
		this.h = h;
		this.w = w;
		this.d = d;
		this.m = m;
		
	}
	
	double ro() {
		return m / value();
	}
}


public class Sample1 {

	public static void main(String[] args) {
		RealBox b = new RealBox();
		System.out.println(b.ro());

	}

}
