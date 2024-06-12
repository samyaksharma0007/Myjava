class ThreadA implements Runnable
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Thread of ThreadA class running"+i);
}
System.out.println(" normal flow of Thread of ThreadA class running");
}
}
class ThreadB implements Runnable
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Thread of ThreadB class running"+i);
}
System.out.println(" normal flow of Thread of ThreadB class running");
}
}
class ThreadEx2
{
public static void main(String args[])
{
ThreadA t1=new ThreadA();
ThreadB t2=new ThreadB();

Thread th1=new Thread(t1);
Thread th2=new Thread(t2);
th1.start();
th2.start();
}
}