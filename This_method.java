class Employee01
{
String name;
int id;
double salary;
void showdata()
{
System.out.println("Employee01 name is:"+name);
System.out.println("Employee01 id is:"+id);
System.out.println("Employee01 salary is:"+salary);
}
void getdata(String n,int i,double s)
{
name=n;
id=i;
salary=s;
this.showdata();
}
}
class This_method
{
public static void main(String args[])
{
Employee01 emp=new Employee01();
emp.getdata("Pranshu the pussy lover",69,6969);
}
}