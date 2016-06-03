package ro.ase.cts.junit;

import java.util.Date;

import junit.framework.TestCase;
import ro.ase.cts.designPatterns.BuilderOrder;
import ro.ase.cts.myClasses.Order;

public class TestOrder extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetUnknownTable(){
		String table="Table 6";
		try{
		
			Order order1=
					new BuilderOrder(1, 1)
					.setTable(table)
					.setItemsOrdered("1")
					.setNrItemsOrdered("3")
					.setTotal(18)
					.build();
			fail("Builderul nu prevede situatia in care se primeste o masa necunoscuta");
		}
		catch(Exception e){
			
		}

	}
	
	public void testSetNullTable(){
		String table=null;
		try{
		
			Order order1=
					new BuilderOrder(1, 1)
					.setTable(table)
					.setItemsOrdered("1")
					.setNrItemsOrdered("3")
					.setTotal(18)
					.build();
			fail("Builderul nu prevede situatia in care nu se furnizeaza masa");
		}
		catch(Exception e){
			
		}

	}
	

}
