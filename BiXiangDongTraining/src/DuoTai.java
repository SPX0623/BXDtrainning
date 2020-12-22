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
