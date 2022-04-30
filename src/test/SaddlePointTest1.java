package test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import feladat.Nyeregpont;

class SaddlePointTest1 {

	@Test
	void test() throws Exception {
		double matrix[][] = 
			{ {1, 2, 3},
              {4, 5, 6},
              {7, 8, 9} };
		double output = Nyeregpont.findSaddleValue(matrix);
		assertEquals(7,output);
	}

}
