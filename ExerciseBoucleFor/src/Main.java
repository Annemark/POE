
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		exercice6();
		exercice5();
		exercice4();
		exercice3();// TODO 正三角	
		exercice2();//TODO 倒三角;
		exercice1();// TODO 四行每行六个星星 
	
	}


	private static void exercice6() {
		System.out.println("Début Exercice 6 ----------------------------");
		int n = 10;// 控制高度
		for(int i = 1; i<=n; i++) {//// 控制高度 这里是行数
			for( int k = 1; k<= n-i; k++) {
				System.out.print(" ");		
			}
			for( int j = 1; j <= i ;j++) {
				System.out.print("*");		
			}
			System.out.println();
		}
	}

	private static void exercice5() {
		System.out.println("Début Exercice 5 ----------------------------");
		
		for(int x = 1; x<=5; x++) {
			for( int y = x; y <= 5 ;y++) {
				System.out.print("*");		
			}
			System.out.println();
		}		
		
	}

	private static void exercice4() {
		System.out.println("Début Exercice 4 ----------------------------");
		
		for(int x = 1; x<=5; x++) {
			for( int y = 1; y <= x ;y++) {
				System.out.print("*");		
			}
			System.out.println();
		}		
		
	}

	private static void exercice3() {
		System.out.println("Début Exercice  3 ----------------------------");
		// TODO 正三角
		int z = 1;
		for(int x = 1; x<=5; x++) {
			//内循环控制每行的个数 列数变少 控制y内圈
			for( int y = 1; y <= z; y++) {
				System.out.print("*");		
			}
			System.out.println();
			z ++;
		}		
		
	}

	private static void exercice2() {
		System.out.println("Début Exercice  2 ----------------------------");
		// TODO 倒三角
		//外循环控制行数 5行
		int z = 5;
		for(int x = 1; x<=5; x++) {
			//内循环控制每行的个数 列数变少 控制y内圈
			for( int y = 1; y <= z; y++) {
				System.out.print("*");		
			}
			System.out.println();
			z --;
		}		
	}
	private static void exercice1() {
		System.out.println("Début Exercice  1 ----------------------------");
		// TODO 	 四行每行六个星星
		//外循环控制行数
			for( int x = 0; x<4; x++) {
				//内循环控制每行的个数 列数
				for(int y=0; y<6; y++) {
					System.out.print("*");		
				}
				System.out.println();
			}			
	}	
	

}
