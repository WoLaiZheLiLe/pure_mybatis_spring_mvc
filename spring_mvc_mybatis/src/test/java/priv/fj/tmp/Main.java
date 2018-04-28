package priv.fj.tmp;

public class Main {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		System.out.println(b.getName() == c.getName());
		System.out.println(b.getObj() == c.getObj());
	}
}
