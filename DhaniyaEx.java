import java.util.*;
class Dhaniya extends Thread
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
void mul()
{
c=a*b;
System.out.println("mult is"+c);
}
{
c=a/b;
System.out.println("div is"+c);
}
}
class Thread3Ex
public static void main(String args[])
Thread t1 = new Thread();
t1.start();
}
}
}


