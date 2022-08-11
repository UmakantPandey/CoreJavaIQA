package arrayscodes;



public class MatricAddition2By2 {
	
	
//	
//	int[][] m1= {{1,2},{3,4}};
//	int[][] m2= {{1,2},{3,4}};
//	int[][] result=new int[2][2];
//	
	
	public int[][] additionOfMatric2By2(int [][] m1, int[][] m2)
	{
		int[][] result=new int[m1.length][m2.length];
		
		for(int i=0;i<m1.length;)
		{
			for(int j=0;j<m2.length;j++)
			{
				result[i][j]=m1[i][j] +m2[i][j];
			}
		}
			
		return result;
	}
	
	

}
