class Cons
{
int a,b;
Cons(int x,int y)
{
a=x;
b=y;
}
void add()
{
int c=a+b;
System.out.println("Addition of a and b is"+c);
}
}
class Parameterised_cons
{
public static void main(String args[])
{
Cons obj=new Cons(69,69);
obj.add();
}
}