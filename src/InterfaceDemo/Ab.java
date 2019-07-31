package InterfaceDemo;

public interface Ab {

	int a = 10;

	abstract void m3();

	default void m1() {
		System.out.println("M1 method");
	}
}
