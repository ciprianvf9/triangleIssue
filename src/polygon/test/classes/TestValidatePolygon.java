package polygon.test.classes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import polygon.src.classes.ValidatePolygon;

public class TestValidatePolygon {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ValidatePolygon validate=new ValidatePolygon();
		
		//define input
		List<Float> sidesLengths = new ArrayList<Float>(); 
			sidesLengths.add((float) 18);
			sidesLengths.add((float) 9);
			sidesLengths.add((float) 16);
		
			assertEquals("Scalene", validate.polygonType(sidesLengths));
			
			//assertEquals("Isocoles", validate.polygonType(sidesLengths));
			
		
	}

}
