package lecture_5;

class Box {
	int h;
	int w;
	int d;
	
	int value() {
		return h * w * d;
	}
}

class RealBox extends Box {
	double m;

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
