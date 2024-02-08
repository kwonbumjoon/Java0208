package ex08;

class Box<T> {
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

class unboxer {
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
}

public class GenericMethod02 {
	public static void main(String[] args) {
		Box<String> sbox = new Box<String>();
		sbox.set("korea");
		String str = unboxer.openBox(sbox);
		System.out.println(str);
	}
}
