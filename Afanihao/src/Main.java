
public class Main {

	public static void main(String[] args) {
		//  给定一个数a, 如果为奇数则输出“为奇数"  。如果是偶数则输出“为偶数”
		
		/**int a = 123; // 给定一个值
		if(a % 2 == 0)
		{
			System.out.println( a + "为偶数");
		}
		else
		{
			System.out.println( a + "为奇数");
		}*/
		
		
		
		
		//描述：
		//给定一个数，判断它是否既能被3整除，又能被7整除。int  a = 123;
		int a = 123;
		if(a % 3 == 0 && a % 7 == 0)
		{
			System.out.println( a + "可以被3和7整除");
		}
		else
		{
			System.out.println( a + "不可以被3和7整除");
		}
		
	}
	
	
	
	

}
