package ro.ase.cts.junit;

import junit.framework.TestCase;
import ro.ase.cts.designPatterns.BuilderOrder;
import ro.ase.cts.myClasses.Order;

public class TestOrderNrItems extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Initializare test privind numarul de produse");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetNrItemsOrdered(){
		String ntItemsOrder="0";
		try{
		
			Order order1=
					new BuilderOrder(1, 1)
					.setTable("Table 2")
					.setItemsOrdered("1")
					.setNrItemsOrdered(ntItemsOrder)
					.setTotal(18)
					.build();
			fail("Builderul nu prevede situatia in care comanda contine 0 produse");
		}
		catch(Exception e){
			
		}

	}

}
