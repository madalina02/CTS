package ro.ase.cts.junit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import junit.framework.TestCase;
import ro.ase.cts.myClasses.ArraysDB;
import ro.ase.cts.myClasses.MenuItem;
import ro.ase.cts.myClasses.UserClient;

public class TestUser extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Initializare TestCase");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testPasswordLength(){
		
		String passwordtoSet="abd";
		try {
			UserClient userClient=new UserClient(1, "Angela", "username1", false, false, "abd", "angela@yahoo.com");
			fail("Constructorul nu prevede cazul cand parola e mai mica de 6 caractere.");
		} catch (Exception e) {
			//e.printStackTrace();
		}	
			
	}
	
	public void testIdNotZero(){
		
		int id=0;
		try {
			UserClient userClient=new UserClient(id, "Ion Ion", "username2", false, false, "parolamea", "ionut@yahoo.com");
			fail("Constructorul nu prevede cazul cand id-ul este 0( id-pentru admin.");
		} catch (Exception e) {
			//e.printStackTrace();
		}	
		
	}
	
	public void testUsernameDuplicate(){
		String usernameToSet="test";

		try{
			UserClient userClient=new UserClient(4, "Ion Ion",usernameToSet, false, false, "parolamea", "ionut@yahoo.com");
		
			fail("Constructorul nu prevede cazul cand username-u este luat.");
			
				
		}
		catch(Exception e){
			
		}
	}

}
