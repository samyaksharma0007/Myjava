class Student15
{
int m1,m2;
void getdata(int a,int b)
{
m1=a;
m2=b;
}
void putdata()
{
System.out.println("Student first sub marks is"+m1);
System.out.println("Student second sub marks is"+m2);
}
}
interface Sport
{
final int SP=69;
abstract void spmarks();
}
class Detail implements Student15 extends Sport
{
public void spmarks()
{
System.out.println("Student sport marks is"+SP);
}
void disp()
{
int total=m1+m2+SP;
putdata();
spmarks();
System.out.println("Student total sub marks is"+total);
}
}
class Interface_example
{
public static void main(String args[])
{
Detail obj=new Detail();
obj.getdata(44,89);
obj.disp();
}
}