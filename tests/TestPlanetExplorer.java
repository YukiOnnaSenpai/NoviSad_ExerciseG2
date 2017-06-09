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
		assertEquals("(0,0,N)", pe.getCoordinates());
	}
	@Test
	public void test_gridInitiation(){
		PlanetExplorer pe = new PlanetExplorer(3, 3, "");
		assertEquals("(3x3)", pe.getGrid() );
	}
	@Test
	public void test_checkInitialcommandF() throws PlanetExplorerException{
		PlanetExplorer pe = new PlanetExplorer(3, 3, "");
		String act = pe.executeCommand("f");
		assertEquals("(0,1,N)",act);
	}
	/*@Test
	public void test_exceptionCommand() throws PlanetExplorerException{
		PlanetExplorer pe = new PlanetExplorer(3, 3, "");
		assertEquals(, pe.executeCommand("yolo"));
	}*/
	
	
}
