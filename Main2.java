interface MyInterface
{
abstract public void myMethod();
}
public class Main2
{
public static void main(String args[])
{
MyInterface obj=new MyInterface()
{
public void myMethod()
{
System.out.println("My method implements in normal class");
}
};
obj.myMethod();
}
}