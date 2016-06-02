package ro.ase.cts.junit;

import java.util.ArrayList;

import junit.framework.TestCase;
import ro.ase.cts.myClasses.MenuItem;
import ro.ase.cts.myClasses.UserAdmin;

public class TestAdminMeniu extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Initilizare test...");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testInsertIntoMenu() throws Exception{
		MenuItem mi=new MenuItem(1, "Atlantica", "Sos de rosii, branza, mozarella", 13);
		
		UserAdmin userAdmin=new UserAdmin(2, "admin manager", "admin01", true, true, "123456", "admin@yahoo.com");
		
		ArrayList<MenuItem> menuList=new ArrayList<>();
		menuList.add(mi);
		try{
			userAdmin.insertItem(mi, menuList);
			fail("Metoda de add nu verifica existenta produsului in meniu");
		}
		catch(Exception e){
			
		}
	}
	
	public void testDeleteFromMenu() throws Exception{
		MenuItem mi=new MenuItem(1, "Atlantica", "Sos de rosii, branza, mozarella", 13);
		
		UserAdmin userAdmin=new UserAdmin(2, "admin manager", "admin01", true, true, "123456", "admin@yahoo.com");
		
		ArrayList<MenuItem> menuList=new ArrayList<>();
		
		try{
			userAdmin.deleteItem(mi, menuList);
			fail("Metoda de add nu verifica daca meniul este gol.");
		}
		catch(Exception e){
			
		}
	}
	


}
