package Lesson32;
/**示例1  
用Screen表示一个屏幕，width, height表示宽和高。
写一个方法pixel() 计算它的像素数。

( 像素计算公式： p = width * height )


输出m,n之间所有的质数
例如，求400~500之间所有的质数

质数:  只能被1和自身整除的，如2，3，5，7，11


*/

public class Main32 {

	public static void main(String[] args) {
		Screen s = new Screen();

		s.width = 1366;

		s.height = 768;

		int p = s.pixel();

		System.out.println("像素：" + p);
		
		//然后调用 showPrimes方法 （里面间接调用了 isPrime方法）类里面方法可以互相调用 前面加上this 表示调用自己的方法
		
		MyMath32 m = new MyMath32();
		m.showPrime( 400,500);
	}
	
}
