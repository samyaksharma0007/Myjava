class Calculator
{
int a,b;
void disp(int x,int y)
{
a=x;
b=y;
System.out.println("number a is:" +a);
System.out.println("number b is:" +b);
}
}
class Arithmetic extends Calculator
{
int c;
void calc(int x,int y)
{
a=x;
b=y;
System.out.println("sum is:" +(a+b));
System.out.println("sub is:"+(a-b));
System.out.println("mult is:"+(a*b));
System.out.println("div is:"+(a/b));
}
}
class Job extends Arithmetic
{
void god(int x)
{
c=x;

System.out.println("square:"+(c*c));
}
}
class Main_multiInher
{
public static void main(String args[])
{
Job obj=new Job();
obj.disp(9,9);
obj.calc(7,4);
obj.god(6);
}
}