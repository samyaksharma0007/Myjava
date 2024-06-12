import java.util.*;
class Student20
{
String name;
int roll;
double m1,m2,m3;
void disp()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the marks of three students");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
System.out.println("student first subject marks is:"+m1);
System.out.println("student second subject marks is:"+m2);
System.out.println("student third subject marks is:"+m3);
}
}
class Data extends Student20
{
Data(int r,String n)
{
roll=r;
name=n;
}
void disp()
{
super.disp();
System.out.println("Student name is:"+name);
System.out.println("Student roll is:"+roll);
}
}
class Super_methodEx
{
public static void main(String args[])
{
Data obj=new Data(69,"Pranshu Bitch");
obj.disp();
}
}