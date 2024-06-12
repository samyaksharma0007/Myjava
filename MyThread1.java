public class MyThread1 extends Thread
{
public void run()
{
System.out.println("r1");
try
{
Thread.sleep(500);
}
catch(InterruptedException e){}
System.out.println("r2");
}
public static void main(String args[])
{
MyThread1 t1=new MyThread1();
MyThread1 t2=new MyThread1();
t1.start();
try
{
t1.join();
}
catch(InterruptedException e){}
t2.start();
}
}