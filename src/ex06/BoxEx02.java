package ex06;

import java.util.concurrent.atomic.AtomicLong;

class Box<T extends Number> {
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

public class BoxEx02 {
	public static void main(String[] args) {
		Box<Integer> ibox = new Box<Integer>();
		Box<Double> dbox = new Box<Double>();
		Box<AtomicLong> atbox = new Box<AtomicLong>();
		Box<Short> sbox = new Box<Short>();
	}

}
