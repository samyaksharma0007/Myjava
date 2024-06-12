class Cons
{
int a,b;
Cons()
{
System.out.println("Default constructor invoked");
}
void add(int x,int y)
{
a=x;
b=y;
int c=a+b;
System.out.println("Addition of a and b is"+c);
}
}
class Default_cons
{
public static void main(String args[])
{
Cons obj=new Cons();
obj.add(69,69);
}
}
