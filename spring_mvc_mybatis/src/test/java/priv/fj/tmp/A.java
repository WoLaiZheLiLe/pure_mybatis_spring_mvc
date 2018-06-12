package priv.fj.tmp;

public class A {
	private String name = "12";
	private Main obj = new Main();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Main getObj() {
		return obj;
	}

	public void setObj(Main obj) {
		this.obj = obj;
	}
	
	public static void main(String[] args) {
		TestEnum test = TestEnum.A;
		switch(test) {
			case A: 
				System.out.println("aa");break;
			case B: break;
		}
		return;
	}
}
