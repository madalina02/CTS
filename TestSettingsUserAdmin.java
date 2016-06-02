package ro.ase.cts.junit;

import junit.framework.TestCase;
import ro.ase.cts.myClasses.UserAdmin;

public class TestSettingsUserAdmin extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetisAdmin() throws Exception
	{
		UserAdmin userAdmin=new UserAdmin(2, "admin manager", "admin01", true, true, "123456", "admin@yahoo.com");
		boolean toSetIsStaff=false;
		try{
			userAdmin.setStaff(toSetIsStaff);
			fail("Setter-ul nu tine cont de faptul ca e admin");
		}
		catch(Exception e){
			
		}
	}
	
	

}
