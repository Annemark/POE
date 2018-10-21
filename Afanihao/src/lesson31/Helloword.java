package lesson31; 
import java.util.Arrays;

//给定一个数组，求里面的能被8整除的数
//int[] arr = {  18,  28, 32, 36, 48 };

public class Helloword {

	public static void main(String[] args) {
		int[] arr = {  18,  28, 32, 36, 48 };
	
		MyMath31 m = new MyMath31();		
		int[] result = m.find8( arr );	
	
		System.out.println(Arrays.toString(result)); // why we can not sop result???

	}

}
