package Lesson32;

public class Screen {

	public int width;
	public int height;
	public int pixel ()
	{
		int result = this.width * this.height;//this表示当前对象 当访问对象自身的属性时，可以直接用this访问

		return result;
	}
	
}
