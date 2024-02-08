package ex13;

class Box<T> {
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}

class Unboxer {
	// super Integer -> Integer 이거나 Integer 상위 클래스면 OK
	// Integer 계층도 ..... Integer -> Number -> Object
	public static void peekBox(Box<? super Integer> box) {
		System.out.println(box);
	}
}

class A {
	@Override
	public String toString() {
		return "A class";
	}
}

public class GenericMethod01 {
	public static void main(String[] args) {

		Box<Integer> ibox = new Box<>();
		ibox.set(1234);
		Unboxer.peekBox(ibox);

//		Box<Double> dbox = new Box<>();
//		dbox.set(12.5);
//		Unboxer.peekBox(dbox);

		Box<Number> dbox = new Box<>();
		dbox.set(12.5);
		Unboxer.peekBox(dbox);

		Box<Object> obox = new Box<>();
		obox.set("설날");
		Unboxer.peekBox(obox);

		Box<Object> obox2 = new Box<>();
		obox2.set(new A());
		Unboxer.peekBox(obox2);
//		System.out.println(obox2.get());
	
	}
}
