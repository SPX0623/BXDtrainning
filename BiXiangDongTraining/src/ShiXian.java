
public class ShiXian {

	public static void main(String[] args) {
		SubInter a=new SubInter();
		a.show();
		System.out.println(a.num);
		System.out.println(Inter.num);
		System.out.println(SubInter.num);

	}

}
interface Inter
{     
	public  final int num=3;
	public abstract void show();
	}
class SubInter implements Inter
{
	public void show() {}
	}

