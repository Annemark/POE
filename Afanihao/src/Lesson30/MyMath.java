package Lesson30;

public class MyMath {
	public void print ( int n )
	{
		int rows = 0; // 行数 
		int cols = 0; // 列数
		for(int k=1; k <= n; k++)
		{
		System.out.print( k + " ");
		cols ++;
			if( cols > rows )
			{
				System.out.print("\n"); // 换行
				rows ++;
				cols = 0;
			}
		}
	}
}
