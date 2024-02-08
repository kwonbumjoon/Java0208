package ex11;

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
	public static <T> void openBox(Box<T> box) {
		System.out.println(box);
	}

	public static void peekBox(Box<?> box) { // ? = 와일드 카드
		System.out.println(box);
	}
}

public class GenericMethod01 {
	public static void main(String[] args) {

		Box<String> sbox = new Box();
		sbox.set("korea");

		Unboxer.peekBox(sbox);
		Unboxer.peekBox(sbox);

	}
}
