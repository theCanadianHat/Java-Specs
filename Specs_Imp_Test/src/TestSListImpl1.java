import junit.framework.TestCase;


public class TestSListImpl1
extends TestCase {

	private SList X0 = new SListImpl1();
	private SList X1 = new SListImpl1();
	private SList X2 = new SListImpl1();
	private SList X3 = new SListImpl1();
	
	public void setUp(){
		X1.addRight(1);
		
		X2.addRight(1);
		X2.addRight(2);
		
		X3.addRight(1);
		X3.addRight(2);
		X3.addRight(3);
	}
	
	public void testClear(){
		X0.clear();
		assertEquals("(<>,<>)",X0.abstractToString());
		
		X1.clear();
		assertEquals("(<>,<>)",X1.abstractToString());
		
		X2.clear();
		assertEquals("(<>,<>)",X2.abstractToString());
	}
	
	public void testAddRight(){
		X0.addRight(0);
		assertEquals("(<>,<0>)",X0.abstractToString());
		
		X1.addRight(2);
		X1.addRight(3);
		assertEquals("(<>,<1,2,3>)",X1.abstractToString());
		
		X2.addRight(3);
		X2.addRight(3);
		X2.addRight(3);
		assertEquals("(<>,<1,2,3,3,3>)",X2.abstractToString());
	}
	
	public void testRemoveRight(){
		X3.removeRight();
		assertEquals("(<>,<2,3>)",X3.abstractToString());
		
		X1.removeRight();
		assertEquals("(<>,<>)",X1.abstractToString());
		
		X2.removeRight();
		assertEquals("(<>,<2>)",X2.abstractToString());
	}
	
	public void testGetElementAt(){
		Object T1 = X1.getElementAt(0);
		Object T2 = X2.getElementAt(X2.getRightLength()-1);
		Object T3 = X3.getElementAt(1);
		
		assertEquals(T1,X1.getElementAt(0));
		assertEquals(T2,X2.getElementAt(X2.getRightLength()-1));
		assertEquals(T3,X3.getElementAt(1));
		
		assertEquals("(<>,<1>)",X1.abstractToString());
		assertEquals("(<>,<1,2>)",X2.abstractToString());
		assertEquals("(<>,<1,2,3>)",X3.abstractToString());
	}
	
	public void testAdvance(){
		X1.advance();
		assertEquals("(<1>,<>)",X1.abstractToString());
		
		X2.advance();
		assertEquals("(<1>,<2>)",X2.abstractToString());
		
		X3.advance();
		assertEquals("(<1>,<2,3>)",X3.abstractToString());
	}
	
	public void testMoveToStart(){
		X1.advance();
		X1.moveToStart();
		assertEquals("(<>,<1>)",X1.abstractToString());

		X2.advance();
		X2.moveToStart();
		assertEquals("(<>,<1,2>)",X2.abstractToString());
	
		X3.advance();
		X3.moveToStart();
		assertEquals("(<>,<1,2,3>)",X3.abstractToString());	
	}
	
	public void testMoveToFinish(){
		X1.moveToFinish();
		assertEquals("(<1>,<>)",X1.abstractToString());
		
		X2.moveToFinish();
		assertEquals("(<1,2>,<>)",X2.abstractToString());
		
		X3.moveToFinish();
		assertEquals("(<1,2,3>,<>)",X3.abstractToString());
	}
	
	public void testGetLeftLenght(){
		int t1 = X1.getLeftLength();
		int t2 = X1.getLeftLength();
		assertEquals(t1,t2);
		assertEquals("(<>,<1>)",X1.abstractToString());
		
		t1 = X2.getLeftLength();
		t2 = X2.getLeftLength();
		assertEquals(t1,t2);
		assertEquals("(<>,<1,2>)",X2.abstractToString());
		
		t1 = X3.getLeftLength();
		t2 = X3.getLeftLength();
		assertEquals(t1,t2);
		assertEquals("(<>,<1,2,3>)",X3.abstractToString());
	}
	
	public void testGetRightLenght(){
		int t1 = X1.getRightLength();
		int t2 = X1.getRightLength();
		assertEquals(t1,t2);
		assertEquals("(<>,<1>)",X1.abstractToString());
		
		t1 = X2.getRightLength();
		t2 = X2.getRightLength();
		assertEquals(t1,t2);
		assertEquals("(<>,<1,2>)",X2.abstractToString());
		
		t1 = X3.getRightLength();
		t2 = X3.getRightLength();
		assertEquals(t1,t2);
		assertEquals("(<>,<1,2,3>)",X3.abstractToString());
	}
}
