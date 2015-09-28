import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {
	// Perform the jUnit test to validate the answer
	@Test
	public void test() {
		// Create an instance of class Triangle
		Triangle myTriangle = new Triangle();
		// Test-1
		myTriangle.setSide1(2);
		myTriangle.setSide2(2);
		myTriangle.setSide3(3);
		// assertTrue test for getArea() and getPerimeter() methods
		assertTrue("Test-1 for Perimeter", myTriangle.getPerimeter() == 7.0);
		assertTrue("Test-1 for Area", myTriangle.getArea() == 1.98);

		// Test-2
		myTriangle.setSide1(3);
		myTriangle.setSide2(4);
		myTriangle.setSide3(5);
		// assertTrue test for getArea() and getPerimeter() methods
		assertTrue("Test-2 for Perimeter", myTriangle.getPerimeter() == 12.0);
		assertTrue("Test-2 for Area", myTriangle.getArea() == 6.0);

		// Test-3
		myTriangle.setSide1(7.5);
		myTriangle.setSide2(10.8);
		myTriangle.setSide3(9.3);
		// assertTrue test for getArea() and getPerimeter() methods
		assertTrue("Test-3 for Perimeter", myTriangle.getPerimeter() == 27.60);
		assertTrue("Test-3 for Area", myTriangle.getArea() == 34.26);
	}

}
