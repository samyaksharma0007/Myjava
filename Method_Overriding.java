class Parent
{
int a,b;
void show(int x,int y)
{
a=x;
b=y;

System.out.println("a is:"+a);
System.out.println("b is:"+b);
}
}
class Child extends Parent
{
void show(int x,int y)
{
a=x;
b=y;
System.out.println("sum is:" +(a+b));
System.out.println("sub is:"+(a-b));
System.out.println("mult is:"+(a*b));
System.out.println("div is:"+(a/b));
}
}
class Method_Overriding
{
public static void main(String args[])
{
Child ch=new Child();
ch.show(87,78);
}
}