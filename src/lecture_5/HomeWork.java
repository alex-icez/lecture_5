package lecture_5;

class Memory {
	int bytes;
	int kbytes;
	int mbytes;
	
	public Memory(int bytes) {
		this(bytes, 0, 0);
	}
	
	public Memory(int bytes, int kbytes, int mbytes) {
		this.bytes = bytes % 1024;
		this.kbytes = (kbytes + (bytes / 1024)) % 1024;
		this.mbytes = mbytes + (kbytes + (bytes / 1024)) / 1024;
	}
	
	public void print() {
		if (mbytes > 0)
			System.out.print(mbytes + "Mb ");
		if (kbytes > 0)
			System.out.print(kbytes + "Kb ");
		System.out.println(bytes + "b");
	}
}


public class HomeWork {

	public static void main(String[] args) {
		Memory m = new Memory(542,442,0);
		m.print();
	}
}
