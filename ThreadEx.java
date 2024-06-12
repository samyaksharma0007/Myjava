class ThreadA implements Thread
{
public void start()
{
for(int i=1;i<=5;i++)
{
System.out.println("Thread of ThreadA class running"+i);
}
System.out.println(" normal flow of Thread of ThreadA class running");
}
}
class ThreadB implements Thread
{
public void start()
{
for(int i=1;i<=5;i++)
{
System.out.println("Thread of ThreadB class running"+i);
}
System.out.println(" normal flow of Thread of ThreadB class running");
}
}
class ThreadEx
{
public static void main(String args[])
{
ThreadA t1=new ThreadA();
ThreadB t2=new ThreadB();
t1.run();
t2.run();
}
}