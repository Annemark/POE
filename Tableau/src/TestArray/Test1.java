package TestArray;

public class Test1 {
	// mes attributs
	 double[] myList = {1.9, 2.9, 3.4, 3.5}; 
	 
	// mes methodes
	public void afficherLeTableau(){     // 打印所有数组元素
		for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
		}
	}

	public void afficherLaSommeDuTableau() { // 计算所有元素的总和
	      System.out.println("Total is " + calculerLaSommeDuTableau());
	}

	public void afficherLaValeurMaxDuTableau() {// 查找最大元素
	      System.out.println("Max is " +calculerLeMaxDuTableau());
	   }

	public double calculerLaMoyenneDuTableau() {
		return calculerLaSommeDuTableau()/myList.length; //moyenne;
	}

	public double calculerLaSommeDuTableau() {
		double total = 0;
	     for (int i = 0; i < myList.length; i++) {
	         total += myList[i];   
	     }
		return total;
	}
	
  public double calculerLeMinDuTableau() {
	  double min = myList[0];
	  for (int i = 1; i < myList.length; i ++) {
		  if (myList[i] < min) min = myList[i];
	  }
	  return min;  
  }
  
  public double calculerLeMaxDuTableau() {
	  double max = myList[0];
	  for (int i = 1; i < myList.length; i ++) {
		  if (myList[i] > max) max= myList[i];
	  }
	  return max;	  
  }
  
	public void afficherLecartMaxDuTableau() {
		System.out.println(Math.abs(calculerLeMaxDuTableau() - calculerLeMinDuTableau()));
	}
	
}


/*1.数组和ArrayList都表示可以存一组同类型的对象；都使用下标定位和查找元素；
2.数组的定义：
int[] num=new int[10];
Employee[] staff=new Employee[100];

3.ArrayList的使用：
List lst＝new ArrayList();
lst.add(employee);

数组（[]）：最高效；但是其容量固定且无法动态改变；
ArrayList：容量可动态增长；但牺牲效率；*/


