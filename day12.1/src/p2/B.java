package p2;

public interface B {
	default void show() {
		System.out.println("In B's show");
	}
}
