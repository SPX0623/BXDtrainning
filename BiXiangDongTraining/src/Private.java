import java.util.Scanner;
class Person1
{
	 private int age;
	 public void setAge(int a)
	 {
		 if(a>0&&a<130)
		 {
			  age=a;
		 }
		 else
		 {
			 System.out.println("error");
		 }
	 }
	 public int getAge()
	 {
		 return  age;
	 }
	void speak()
	{
		System.out.println("age="+ age);
	}
	
	}

public class Private {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Scanner Shu=new Scanner(System.in);
		Person1 p1=new Person1();
		Scanner p=new Scanner(System.in);
		int a=p.nextInt();
		p1.setAge(a);
		p1.speak();
		p.close();

	}

}
