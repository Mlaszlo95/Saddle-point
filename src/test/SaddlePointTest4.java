package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import feladat.Nyeregpont;

class SaddlePointTest4 {
	//értéke 5-nek kell lennie
	@Test
	void test() throws Exception {
		double matrix[][] = 
				{{3, 2, 4, 9},
				 {4, 4, 4, 3},
				 {5, 6, 5, 6},
				 {5, 7, 5, 9}};
		
		double output = Nyeregpont.findSaddleValue(matrix);
		assertEquals(5,output);
	}

}
