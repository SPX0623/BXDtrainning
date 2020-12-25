
public class ZhuBan {

	public static void main(String[] args) {
		MB mb=new MB();
		mb.run();
		mb.usePCI(null);
		mb.usePCI(new SoundCard());
		mb.usePCI(new NetCard());
	}

}
class MB
{
	public  void run()
	{
		System.out.println("mainboard run");
	}
	public void usePCI(PCI p)
	{
		if(p!=null)
		{
			p.open();
			p.close();
		}
	}
}
interface PCI
{
	public void open();
	public void close();
}
class SoundCard implements PCI
{
	public void open()
	{
		System.out.println("SoundCard open");
	}
	public void close()
	{
		System.out.println("SoundCard close");
	}
	}
class NetCard implements PCI
{
	public void open()
	{
		System.out.println("NetCard open");
	}
	public void close()
	{
		System.out.println("NetCard close");
	}
	}