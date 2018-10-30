package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void Constructortest() {
		try {
			Rectangle r1 = new Rectangle(4,4);
		} catch (Exception e) {
			fail("Test failed to build a Rectangle");
		}
		
	}
	@Test 
	void getteriLengthTest() {
		Rectangle r1 = new Rectangle(1,1);
        assertTrue(r1.getiLength() == 1);
	}
	@Test 
	void setteriLengthTest() {
		Rectangle r1 = new Rectangle(2,2);
		r1.setiLength(1);
        assertTrue(r1.getiLength() == 1);
	}
	@Test 
	void getteriWidthTest() {
		Rectangle r1 = new Rectangle(1,1);
        assertTrue(r1.getiWidth() == 1);
	}
	@Test 
	void setteriWidthTest() {
		Rectangle r1 = new Rectangle(2,2);
		r1.setiWidth(1);
        assertTrue(r1.getiWidth() == 1);
	}
	@Test
	void areaTest() {
		int expectedArea = 16;

		Rectangle r1 = new Rectangle(4, 4);

		assertEquals(expectedArea, r1.area(), 16);	
	}
	@Test
	void perimeterTest() {
	
		int expectedPerimeter = 16;

		Rectangle r1 = new Rectangle(4, 4);

		assertEquals(expectedPerimeter, r1.perimeter(),16);	
	}
	@Test 
	void compareToTest() {
		
	}

}
