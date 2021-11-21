package p2;

public interface A {
	//javac : public
	default void show() {
		System.out.println("In A's show");
	}
}
