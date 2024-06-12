class Rectangle
{
int len,br;
Rectangle()
{
System.out.println("Default Constructor of Rectangle class invoked");
}
Rectangle(int l,int b)
{
this();
len=l;
br=b;
}
void area()
{
int res=len*br;
System.out.println("Area of rectangle is"+res);
}
}
class This_thanos
{
public static void main(String args[])
{
Rectangle rec=new Rectangle(7,8);
rec.area();
}
}