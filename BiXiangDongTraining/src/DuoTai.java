abstract class Animal
{
	abstract void eat();
	abstract void play();
	}
class Cat extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void play()
	{
		System.out.println("ץ����");
	}
	
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ");
	}
	public void play()
	{
		System.out.println("����");
	}
	}
class Pig extends Animal
{
	public void eat()
	{
		System.out.println("����ˮ");
	}
	public void play()
	{
		System.out.println("����");
	}
	}



public class DuoTai {

	public static void main(String[] args) {
		/*Animal p=new Pig();
		p.eat();*/
		eat_1(new Dog());
		play_1(new Pig());
		

	}
	public static void eat_1(Animal a)
	{
		a.eat();
	}
	public static void play_1(Animal a)
	{
		a.play();
	}

}
