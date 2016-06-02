package ro.ase.cts.junit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class MySuiteTest {

	public static Test suite() {
		TestSuite suite = new TestSuite(MySuiteTest.class.getName());
		

		suite.addTestSuite(TestAdminMeniu.class);
		suite.addTestSuite(TestSettingsUserAdmin.class);
		suite.addTestSuite(TestUser.class);
		suite.addTestSuite(TestSetIngredients.class);
		suite.addTestSuite(TestItem.class);
		suite.addTestSuite(TestOrder.class);
		

		return suite;
	}

}
