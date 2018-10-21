package puppy;

public class Puppy{
	   int puppyAge;
	   public Puppy(String name){
	      // 这个构造器仅有一个参数：name
	      System.out.println("小狗的名字是 : " + name ); 
	   }
	 
	   public void setAge( int age ){
	       puppyAge = age;
	   }
	 
	   public int getAge( ){
	       System.out.println("小狗的年龄为 : " + puppyAge ); 
	       return puppyAge;§§§§§§§§§§§§§§§§§§§bv 
	   }
	 
	   public static void main(String []args){
	      /* 创建对象 variable myPuppy de type Puppy*/
	      Puppy myPuppy = new Puppy( "tommy" );
	      /* 通过方法来设定age dans l'objt de la varibe*/
	      myPuppy.setAge( 2 );
	      /* 调用另一个方法获取age */
	      myPuppy.getAge( );
	      /*你也可以像下面这样访问成员变量 */
	      System.out.println("变量值 : " + myPuppy.puppyAge );
	      Puppy anotherPuppy = new Puppy("raoul");
	      System.out.println("小狗的名字是 : " +anotherPuppy);
	      
	   }
	}