package epamt5;

import static org.junit.Assert.*;

import org.junit.Test;

import epamt5.House_Construction;

public class House_ConstructionTest {

	@Test
	public void testcost() {
		House_Construction h=new House_Construction();
		assertEquals(12500.00 ,h.cost("high", "yes", 5),0);
				
	}

}
