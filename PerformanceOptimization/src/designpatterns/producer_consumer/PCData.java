package designpatterns.producer_consumer;

public class PCData {

	private final int intData;

	public PCData(int d) {
		this.intData = d;
	}

	public PCData(String d) {
		this.intData = Integer.valueOf(d);
	}

	public int getData() {
		return intData;
	}

	public String toString() {
		return "data:" + intData;
	}
}
