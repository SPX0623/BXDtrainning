class Perso

{
	String name;
	int age;
	public  static void show()//如果我想直接不走变量从perso，show()输出的话需要加个static；
	{
		System.out.println(",hello world,");
	}
	}

public class Static_1 {

	public static void main(String[] args) 
	 {
		Perso p=new Perso();
	p.name="spx";
	p.age=19;
		p.show();

	}

}
