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



public class DuoTai_2 {

	public static void main(String[] args) {
		//Animal p=new Pig();
		//p.eat();
		Xz(new Cat());//Animal a=new Cat()
		//Xz(new Dog());
		//Xz(new Pig());
		
		

	}
	public static void Xz(Animal a)
	{
		if(a instanceof Dog)
		{
			Dog b=(Dog)a;
			b.eat();
			b.play();
			
		}
		else if(a instanceof Cat)
		{
			Cat b=(Cat)a;
			b.eat();
			b.play();
		}
		else if(a instanceof Pig)
		{
			Pig b=(Pig)a;
			b.eat();
			b.play();
		}
	}
}
