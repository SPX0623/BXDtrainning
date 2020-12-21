import java.util.Scanner;
class Person
{
	private String name;
	private int age;
	{
		//System.out.println("person code run");
	cry();
	}
	Person()
	{
		//System.out.println("name="+name+"age="+age);
		//cry();
	}
	Person(String name)
	{
		this();
		this.name=name;
		//System.out.println("name="+name+"age="+age);
		//cry();
	}
	Person(String name,int age)
	{
		this(name);
		this.age=age;
		
		//System.out.println("name="+name+"age="+age);
		//cry();
	}
	Person(int age)
	{ 
		this();
		this.age=age;
		//System.out.println("name="+name+"age="+age);
		//cry();
	}
	void speak()
	{
		System.out.println("name="+name+"age="+age);
	}

	void setName(String name)
	{
	   this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setAge(int a)
	{
		age=a;
	}
	int getAge()
	{
		return age;
	}
	
	
public void cry()
{
	System.out.println("cry........");
	}
}
public class GouZao {
	

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年龄和名字");
		int a=input.nextInt();
		String n=input.nextLine();
		
        
	    
		Person p=new Person(n,a);
		//p.setName(n);
		//p.setAge(a);
		
		System.out.println(p.getName()+p.getAge());
		p.speak();
		

	}
	 
		

	

}
