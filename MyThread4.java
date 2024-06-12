public class MyThread4 extends Thread
{
MyThread4(String str)
{
super(str);
}
public void run()
{
System.out.println(Thread.currentThread().getName()+"Started");
try
{
Thread.sleep(1500);
}
catch(InterruptedException e){
System.out.println(e);
}
System.out.println(Thread.currentThread().getName()+"Finished");
}
public static void main(String args[])
{
MyThread4 t1=new MyThread4("first thread");
MyThread4 t2=new MyThread4("second thread");
t1.start();
try{
t1.join();}
catch(InterruptedException e){}
t2.start();
}
}