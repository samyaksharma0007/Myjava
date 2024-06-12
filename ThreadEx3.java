import java.util.*;
class Thread3 extends Thread
int a,b,c;
public void run()
{
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
add();
sub();
mult();
div();
}
void add()
{
c=a+b;
System.out.println("add is"+c);
}
void sub()
{
c=a-b;
System.out.println("sub is"+c);
}
void mult()
{
c=a*b;
System.out.println("mult is"+c);
}
{
c=a/b;
System.out.println("div is"+c);
}
}
class ThreadEx3
public static void main(String args[])
Thread3 t1 = new Thread3();
t1.start();
}
}
}


