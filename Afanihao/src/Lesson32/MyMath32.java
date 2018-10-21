package Lesson32;

//先写一个类MyMath，添加两个方法

public class MyMath32 {
	public boolean isPrime( int n )
	// 判断n是否为质数; true,是质数; false, 不是质数 
	{ for( int i = 2; i< n;  i++)
	    {
			if( n%i == 0)
			{
				return false;
			}
	    }
		return true;
	}
	// 输出m,n之间所有的质数,输出就不用返回值了 用void
	public void showPrime(int m, int n) //showPrimes方法 （里面间接调用了 isPrime方法）类里面方法可以互相调用 前面加上this 表示调用自己的方法
	{
		for(int i=m;  i<=n; i++)//遍历一下从m到n的数
		{
			if( this.isPrime( i )) // this.isPrime() 调用自己的方法 
			{
				System.out.println("质数: " + i );
			}
		}

	}

}
