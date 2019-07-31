package AbsractClassAndInterface;

public class Test extends AbstractDemo {
	Test(int b) {
		super(b);
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		Test t=new Test(20);
		t.div();
		t.div("Testing", " Andhalkar", " ");
	}

	
	public void div() {
		int a=10,b=30;
		int c=b/a;
		System.out.println("Division of the c: "+c);
		
		
	}


	@Override
	protected void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}
	