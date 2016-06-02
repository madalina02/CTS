package ro.ase.cts.junit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;
import ro.ase.cts.myClasses.ArraysDB;
import ro.ase.cts.myClasses.MenuItem;

public class TestItem extends TestCase {
	

	protected void setUp() throws Exception {

		super.setUp();
		ArraysDB myarray=new ArraysDB();
		myarray.getItems();
		System.out.println("Test loading...");
	}

	public TestItem() {
		super();
		System.out.println(
				"Initializare TestCase");
	}
	
	//testare la setare item pentru un produs...
	public void testItemNull()
	{
		String itemName=null;
		try {
			MenuItem mi = 
					new MenuItem(1,itemName,"some ingredients",10);
			fail("Constructorul nu prevede cazul gresit pentru null");
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
	
	public void testSetarePretNegativ(){
		float pret=-10;
		try {
			MenuItem mi = 
					new MenuItem(1,"itemName","some ingredients",pret);
			fail("Constructorul nu prevede cazul gresit pentru un pret negativ");
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
	
	public void testSetId() throws Exception{
		int idToSet=4;
		MenuItem mi = null;
		try {
			mi = new MenuItem(1,"itemName","some ingredients",10);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ArrayList<Integer> ids=new ArrayList<>();
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","1234");
			PreparedStatement statement = con.prepareStatement("Select * from menu");
			ResultSet result;
			
			result = statement.executeQuery();
			while(result.next()){
				ids.add(result.getInt(1));
			}		
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		mi.setId(idToSet);
		for(int i=0;i<ids.size();i++){
			if(ids.get(i)==idToSet){
				fail("Id-ul a fost setat deja pentru o alta comanda.");
			}
		}
		
		


	
	}

}
