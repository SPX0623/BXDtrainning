class Perso

{
	String name;
	int age;
	public  static void show()//�������ֱ�Ӳ��߱�����perso��show()����Ļ���Ҫ�Ӹ�static��
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
