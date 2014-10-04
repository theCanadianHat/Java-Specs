
public class MainDriver {

	public static void main(String[] args) {
		SList x = new SListImpl1();
		
		x.addRight(0);
		x.addRight(1);
		x.addRight(2);
		x.addRight(3);
		x.addRight(4);
		
		System.out.println(x.abstractToString());
		
		x.advance();
		x.advance();
		x.advance();
		System.out.println(x.abstractToString());
		x.moveToFinish();
		System.out.println(x.abstractToString());

	}

}
