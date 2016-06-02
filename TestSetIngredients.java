package ro.ase.cts.junit;

import junit.framework.TestCase;
import ro.ase.cts.myClasses.MenuItem;

public class TestSetIngredients extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Initializare TestCase");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetIngredients() throws Exception{
		MenuItem mi=new MenuItem(3, "Pizza", "Ingrediente si descriere", 13);
		String description="De mai bine de 10 ani Cuptorul cu lemne te-a obisnuit cu cea mai"
				+ " gustoasa pizza si servicii de catering la cel mai inalt nivel. Respectam "
				+ "traditia si coacem o pizza pe vatra langa lemnele ce ard linistit, un blat"
				+ " subtire si pufos si ingrediente atent selectionate de cea mai buna calitate, o pizza"
				+ " pe gustul romanului, deliciosa si plina de savoare.Din faina de cea ma buna"
				+ " calitate, sos de rosii, mozzarella, legume proaspete si nu in ultimul rand"
				+ " ingrediente speciale ia nastere cea mai savuroasa si bogata pizza din oras. "
				+ "Am dezvoltat un meniu diversificat pentru toate gusturile si pretentiile"
				+ " clientilor nostrii, atat retete clasice cat si retete originale, r"
				+ "etete atent concepute pentru a satisface chiar si cele mai exigente gusturi."
				+ " Va garantam astfel ca veti avea parte de cea mai gustoasa pizza pentru acasa "
				+ "sau la birou.";
		try{
			mi.setIngredients(description);
			fail("Metoda de setare nu verifica lungimea string-ului primit.");
		}
		catch(Exception e){
			
		}
		
	}

}
