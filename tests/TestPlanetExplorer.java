import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	/*@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void test_constructorTest(){
		PlanetExplorer pe = new PlanetExplorer(3,3,"");
		assertNotNull(pe);
	}
	
	@Test
	public void test_startPosition(){
		PlanetExplorer pe = new PlanetExplorer(3,3,"");
		String expected = "(0,0,N)";
		assertEquals(expected, pe.getCoordinates());
	}
	
}
