
public class ShiJian {

	public static void main(String[] args) {
	GetTime tm=new GetTime();
	tm.gettime();

	}

}
class GetTime
{
	public void gettime()
	{
	long start=System.currentTimeMillis();
	for(int a=0;a<1000;a++)
	{
		System.out.print(a);
	}
	long end=System.currentTimeMillis();
	System.out.println("ºÁÃë£º"+(end-start));
	}
}

