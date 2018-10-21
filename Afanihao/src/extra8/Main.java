package extra8;

public class Main {

	public static void main(String[] args) {
		
		

		Human a = new Human("张"); // 小张

		Human b = new Human("王"); // 小王

		a.merryWith( b ); // a与b结婚

		a.introduce(); // a自我介绍

		b.introduce(); // b自我介绍

		}

		

		//关键：mate是一个引用类型，它只是指向了一个Human对象。
	}


