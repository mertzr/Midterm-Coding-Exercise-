package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuboidTest {
	
	@Test
	void ConstructorTest() {
		try {
			Cuboid r1 = new Cuboid(4,4,4);
		} catch (Exception e) {
			fail("Test failed to build a Cuboid");
		}
		
	}
	@Test 
	void getteriDepthTest() {
		Cuboid c1 = new Cuboid(1,1,1);
        assertTrue(c1.getiDepth() == 4);
	}
	@Test 
	void setteriDepthTest() {
		Cuboid c1 = new Cuboid(1,1,1);
		c1.setiDepth(4);
        assertTrue(c1.getiDepth() == 4);
	}
	@Test
	void areaTest() {
		int expectedArea = 96;
		Cuboid c1 = new Cuboid(4,4,4);
		assertEquals(expectedArea, c1.area(), 96);	
	}
	@Test
	void perimeterTest() {
		  boolean thrown = false;

		  try {
			perimeter();
		  } catch (UnsupportedOperationException e) {
		    thrown = true;
		  }

		  assertTrue(thrown);
		}
		
	}
	@Test 
	void sortAreaTest() {
		
	}
	@Test
	void sortVolumeTest() {
		
	}
}
