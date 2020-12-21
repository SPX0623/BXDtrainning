class Person_1
{
	String name;
	static String country="CN";
	public void show()
	{
		
	
	System.out.println(name+country);
	
	}
	}


public class Static {

	public static void main(String[] args) {
     Person_1 p=new Person_1();	
     System.out.println(Person_1.country);
     p.show();
  

	}

}
