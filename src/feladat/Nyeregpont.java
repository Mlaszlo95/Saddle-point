package feladat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Nyeregpont {
	public static int N = 0;
	public static double saddlePoint;
	
	public static boolean findSaddleIsExist(double matrix[][])
    {
		if(N == 0) {
			N = matrix.length;
		}
		
        for (int i = 0; i < N; i++)
        {
            double minRow = matrix[i][0];
            int colInd = 0;
            for (int j = 1; j < N; j++)
            {
                if (minRow > matrix[i][j])
                {
                    minRow = matrix[i][j];
                    colInd = j;
                }
            }
            int k;
            for (k = 0; k < N; k++)
                if (minRow < matrix[k][colInd])break;
            	if (k == N){
            		saddlePoint = minRow;
            		return true;
            	}
        }
        return false;
    }
	
	public static double findSaddleValue(double matrix[][]) throws Exception
    {
		if(!findSaddleIsExist(matrix)) {
			throw new Exception("Nyereg pont nem l�tezik!");
		}
		return saddlePoint;
    }
	
	
	
	public static double[][] readinputFromFile() throws Exception{	
		Scanner in = new Scanner(new File("./src/feladat/matrixinput.txt"));
		N = in.nextInt();
		if(N < 2) throw new Exception("Az N �rt�ke a f�jlban nem m�trix!");
		
		double[][] matrix = new double[N][N];
		

		for(int r = 0;r < matrix.length; r++){
			for(int c = 0;c < matrix[r].length; c++){
				matrix[r][c] = in.nextDouble();
			}
		}
		
		return matrix;
	}
     
    // Driver method
    public static void main(String[] args)
    {
    	try {
    		double mat[][] =  readinputFromFile();
    		if (!findSaddleIsExist(mat)) {
    			System.out.println("Nincs nyeregpont");
    		}else {
    			System.out.print("Nyereg pont a k�vetkez�: " + findSaddleValue(mat));
    		}
    	}catch(Exception e) {
    		System.out.print(e);
    	}
    }
}  
	

