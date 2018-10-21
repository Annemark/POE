package extra8;

public class Human

{

private String name; // 名字

private Human mate; // 配偶 ( 指向另外一个Human对象)

public Human(String name)

{

this.name = name;

}

// 与另一人结婚

public void merryWith ( Human someone)

{

this.mate = someone;

someone.mate = this;

}

// 自我介绍

public void introduce()

{

System.out.println("我叫" + this.name + ", 我爱人叫" + mate.name);

}

}

//然后可以像如下形式使用这个类，



