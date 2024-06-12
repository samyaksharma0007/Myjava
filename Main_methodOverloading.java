class Overload
{
int a,b;
double c;
void calc(int x)
{
a=x;
System.out.println("_____________________");
System.out.println("number is:"+a);
}
void calc(int x,int y)
{
a=x;
b=y;
System.out.println("_____________________");
System.out.println("addition is:"+(a+b));
}
void calc(int x,double y)
{
a=x;
c=y;
System.out.println("_____________________");
System.out.println("addition is:"+(a+c));

System.out.println("_____________________");
System.out.println("mullti is:"+(a*c));

System.out.println("_____________________");
System.out.println("div is:"+(a/c));

System.out.println("_____________________");
System.out.println("sub is:"+(a-c));
}
}
class Main_methodOverloading
{
public static void main(String args[])
{
Overload obj=new Overload();
obj.calc(10);
obj.calc(33,8);
obj.calc(5,7.2);
}
}