package multiThreading;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class ThreadJoinDemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		MyThread t = new MyThread();
		t.start();
		t.join(3000);
		for(int i=1;i<=10;i++)
			System.out.println("Main Thread");
	}
}