package lesson31;
//给定一个数组，求里面的能被8整除的数
//int[] arr = {  18,  28, 32, 36, 48 };

public class MyMath31 {

	// 把符合要求的数放在返回值里
	public int[] find8 ( int[] arr)
	{
		// 创建等大的数组
		int[] temp = new int[ arr.length];
		int count = 0;		
		for (int i=0; i<arr.length; i++)
		{
			if( arr[i] % 8 == 0)
			{
				temp[count] = arr[i];
				count ++;
			}
		}		
		// 拷贝到结果数组里
		int[] result = new int[ count ];
		for(int i=0; i<count; i++)
		{
			result[i] = temp[i];
		}		
		return result;
	}


}
