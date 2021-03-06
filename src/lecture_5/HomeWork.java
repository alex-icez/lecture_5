package lecture_5;

class Memory {
	private int bytes;
	private int kbytes;
	private int mbytes;
	
	public int getBytes() {
		return bytes;
	}
	
	public void setBytes(int bytes) {
		if (bytes > 1023 || bytes < 0)
			System.out.println("ERROR: Incorrect input");
		else
			this.bytes = bytes;
	}
	
	public int getKbytes() {
		return kbytes;
	}

	public void setKbytes(int kbytes) {
		this.kbytes = kbytes;
	}

	public Memory(int bytes) {
		this(bytes, 0, 0);
	}

	public Memory(int bytes, int kbytes, int mbytes) {
		this.bytes = bytes % 1024;
		this.kbytes = (kbytes + (bytes / 1024)) % 1024;
		this.mbytes = mbytes + (kbytes + (bytes / 1024)) / 1024;
	}
	
	protected void print(int a) {
		if (mbytes > 0)
			System.out.print(mbytes + "Mb ");
		if (kbytes > 0)
			System.out.print(kbytes + "Kb ");
		System.out.println(bytes + "b");
	}
	
	public void print() {
		print(123);
	}
}


public class HomeWork {

	public static void main(String[] args) {
		Memory m = new Memory(542,442,0);
		m.setBytes(-12321);
		//m.kbytes = -64564;
		
		m.print();
	}
}
