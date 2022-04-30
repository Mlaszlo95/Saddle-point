package test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import feladat.Nyeregpont;

class SaddlePointTest3 {

	@Test
	void test() {
		double matrix[][] = 
				{{1, 2, 3},
                {4, 5, 6},
                {10, 18, 4}};
		boolean output = Nyeregpont.findSaddleIsExist(matrix);
		assertEquals(false,output);
	}

}
