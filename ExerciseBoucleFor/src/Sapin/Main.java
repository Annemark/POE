package Sapin;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int x = 8;
		int l = x*2 -1;
		int z = l/5;
		
		for (int i = 1; i <= x; i++) {
            for(int j=1;j<=3*(3-i);j++){
                System.out.print("°");
            }
            for (int j = 1; j <= i; j++) {
                for(int k=1;k<=5;k++){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();

		for(int x = 1; x<=5; x++) {
			//内循环控制每行的个数 列数变少 控制y内圈
			for( int y = 1; y <= z; y++) {
				System.out.print("*");		
			}
			System.out.println();
			z ++;
		}		
		
	}

}
