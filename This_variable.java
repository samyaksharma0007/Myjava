class Student0
{
String name;
int roll;
double per;
Student0(String name,int roll,double per)
{
this.name=name;
this.roll=roll;
this.per=per;
}
void display()
{
System.out.println("student name is:"+this.name);
System.out.println("student roll is:"+this.roll);
System.out.println("student per is:"+this.per);
}
}
class This_variable
{
public static void main(String args[])
{
Student0 stu=new Student0("Pranshu is gay",69,69);
stu.display();
}
}