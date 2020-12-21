
public class ShiJian {

	public static void main(String[] args) {
	//GetTime tm=new GetTime();
	//tm.gettime();
		SubTime gt=new SubTime();
		gt.gettime();

	}
}



class  GetTime
{
	public void  gettime()
	{
	long start=System.currentTimeMillis();
	runcode();
	long end=System.currentTimeMillis();
	System.out.println("∫¡√Î£∫"+(end-start));
	}
    public abstract void runcode()
    {
    	for(int a=0;a<1000;a++)
	 {
		System.out.print(a);
	 }
    }

}


class SubTime extends GetTime
{
	public void runcode()
	{
		for(int a=0;a<4000;a++)
		{
			System.out.print(a);
		}
	}
	
	}
