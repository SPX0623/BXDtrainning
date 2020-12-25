abstract class Animal
{
	abstract void eat();
	abstract void play();
	}
class Cat extends Animal
{
	public void eat()
	{
		System.out.println("吃鱼");
	}
	public void play()
	{
		System.out.println("抓老鼠");
	}
	
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("吃骨头");
	}
	public void play()
	{
		System.out.println("看家");
	}
	}
class Pig extends Animal
{
	public void eat()
	{
		System.out.println("吃泔水");
	}
	public void play()
	{
		System.out.println("拱地");
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
